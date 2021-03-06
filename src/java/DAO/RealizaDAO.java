/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.RealizaBean;
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
public class RealizaDAO {

    private final String consulta = "SELECT * FROM Realiza";
    private final String insertar = "INSERT INTO Realiza VALUES(?, ?, ?, ?)";

    public boolean buscar(RealizaBean bean) {
        boolean estado = false;
        String buscar = "SELECT * FROM Realiza WHERE alumnoMatricula = '"
                + bean.getAlumnoMatricula() + "' AND encuestaIdencuesta = '"
                + bean.getEncuestaIdencuesta() + "' AND idPeriodo = " + bean.getIdPeriodo();
        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(buscar);

            ResultSet rs = ps.executeQuery();

            estado = rs.next();

        } catch (SQLException ex) {
            System.out.println("RealizaDAO/buscar: " + ex.getMessage());
        }

        return estado;
    }

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                RealizaBean bean = new RealizaBean(
                        rs.getInt("idgenera"),
                        rs.getString("alumnoMatricula"),
                        rs.getInt("encuestaIdencuesta"),
                        rs.getInt("idPeriodo")
                );
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("RealizaDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(RealizaBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setInt(1, bean.getIdgenera());
            ps.setString(2, bean.getAlumnoMatricula());
            ps.setInt(3, bean.getEncuestaIdencuesta());
            ps.setInt(4, bean.getIdPeriodo());

            estado = ps.executeUpdate() != 0;
            ps.close();
        } catch (SQLException ex) {
            System.out.println("RealizaDAO/insertar: " + ex.getMessage());
        }

        return estado;
    }
}
