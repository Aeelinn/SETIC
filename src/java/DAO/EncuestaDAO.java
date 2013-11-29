/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.EncuestaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aya
 */
public class EncuestaDAO {

    private final String consulta = "SELECT * FROM Encuesta";
    private final String like = "SELECT * FROM Encuesta WHERE nombre LIKE '%?%'";
    private final String insertar = "INSERT INTO Encuesta VALUES(?, ?, ?, ?)";

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EncuestaBean bean = new EncuestaBean(
                        rs.getInt("idencuesta"),
                        rs.getString("nombre"),
                        rs.getInt("numeroDePreguntas"),
                        rs.getInt("tipoRespuestas")
                );
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public List like(String regex) {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ps.setString(1, regex);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EncuestaBean bean = new EncuestaBean(
                        rs.getInt("idencuesta"),
                        rs.getString("nombre"),
                        rs.getInt("numeroDePreguntas"),
                        rs.getInt("tipoRespuestas")
                );
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(EncuestaBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setInt(1, bean.getIdencuesta());
            ps.setString(2, bean.getNombre());
            ps.setInt(3, bean.getNumeroDePreguntas());
            ps.setInt(4, bean.getTipoRespuestas());

            estado = ps.executeUpdate() != 0;
            ps.close();
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/insertar: " + ex.getLocalizedMessage());
        }

        return estado;
    }
}
