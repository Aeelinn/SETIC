/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.PeriodoBean;
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
public class PeriodoDAO {

    private final String consulta = "SELECT * FROM Periodo";
    private final String insertar = "INSERT INTO Periodo VALUES(?, ?)";

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PeriodoBean bean = new PeriodoBean(
                        rs.getInt("idPeriodo"),
                        rs.getString("nombre"));
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("PeriodoDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(PeriodoBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setInt(1, bean.getIdPeriodo());
            ps.setString(2, bean.getNombre());

            estado = ps.executeUpdate() != 0;
        } catch (SQLException ex) {
            System.out.println("PeriodoDAO/insertar: " + ex.getMessage());
        }

        return estado;
    }
}
