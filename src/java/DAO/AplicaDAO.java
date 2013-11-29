/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.AplicaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aya
 */
public class AplicaDAO {

    private final String consulta = "SELECT * FROM Aplica";
    private final String insertar = "INSERT INTO Aplica VALUES(?, ?, ?)";

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                AplicaBean bean = new AplicaBean(
                        rs.getInt("encuestaIdencuesta"),
                        rs.getInt("idAdministrador"),
                        rs.getString("fecha"));
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("AlumnoDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(AplicaBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setInt(1, bean.getEncuestaIdencuesta());
            ps.setInt(2, bean.getIdAdministrador());
            ps.setString(3, bean.getFecha());

            estado = ps.executeUpdate() != 0;
            ps.close();
        } catch (SQLException ex) {
            System.out.println("AplicaDAO/insertar: " + ex.getMessage());
        }

        return estado;
    }
}
