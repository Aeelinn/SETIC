/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.EncuestaBean;
import java.sql.Connection;
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
    private final String insertar = "INSERT INTO Encuesta VALUES(NULL, ?, ?, ?, ?, ?)";
    private final String encuesta
            = "SELECT * FROM Encuesta WHERE (SELECT CURRENT_DATE()) BETWEEN activoInicial AND activoFinal";

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EncuestaBean bean = new EncuestaBean(
                        rs.getString("nombre"),
                        rs.getInt("numeroDePreguntas"),
                        rs.getInt("tipoRespuestas"),
                        rs.getString("activoInicial"),
                        rs.getString("activoFinal")
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
                    .prepareStatement(
                            "SELECT * FROM Encuesta WHERE nombre LIKE '%" + regex + "%'");
            ps.setString(1, regex);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EncuestaBean bean = new EncuestaBean(
                        rs.getString("nombre"),
                        rs.getInt("numeroDePreguntas"),
                        rs.getInt("tipoRespuestas"),
                        rs.getString("activoInicial"),
                        rs.getString("activoFinal")
                );
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public int insertar(EncuestaBean bean) {
        int index = 0;

        try {
            Connection con = MySQL_Connection.getConection();
            PreparedStatement ps = con.prepareStatement(insertar);

            ps.setString(1, bean.getNombre());
            ps.setInt(2, bean.getNumeroDePreguntas());
            ps.setInt(3, bean.getTipoRespuestas());
            ps.setString(4, bean.getActivoInicial());
            ps.setString(5, bean.getActivoFinal());

            ps.executeUpdate();
            ps = con.prepareStatement("SELECT LAST_INSERT_ID()");

            //ps = MySQL_Connection.getConection()
            //        .prepareStatement("SELECT LAST_INSERT_ID()");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                index = rs.getInt(1);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/insertar: " + ex.getLocalizedMessage());
        }

        return index;
    }

    public boolean existe(EncuestaBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement("SELECT idencuesta FROM Encuesta WHERE nombre = \""
                            + bean.getNombre() + "\"");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                estado = rs.next();
            }
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/existe: " + ex.getMessage());
        }

        return estado;
    }

    public EncuestaBean getEncuestaActiva() {
        EncuestaBean bean = null;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(encuesta);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                int numeroDePreguntas = rs.getInt("numeroDePreguntas");
                int tipoRespuesta = rs.getInt("tipoRespuestas");
                String activoInicial = rs.getString("activoInicial");
                String activoFinal = rs.getString("activoFinal");

                bean = new EncuestaBean(nombre, numeroDePreguntas, tipoRespuesta, activoInicial, activoFinal);
                bean.setEncuestaIdencuesta(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("EncuestaDAO/getEncuestaActiva: "
                    + ex.getMessage());
        }

        return bean;
    }
}
