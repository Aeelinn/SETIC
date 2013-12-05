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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aya
 */
public class EncuestaDAO {

    private final String consulta = "SELECT * FROM Encuesta";
    private final String like = "SELECT * FROM Encuesta WHERE nombre LIKE '%?%'";
    private final String insertar = "INSERT INTO Encuesta VALUES(NULL, ?, ?, ?)";

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

    public int insertar(EncuestaBean bean) {
        int index = 0;

        try {
            Connection con = MySQL_Connection.getConection();
            PreparedStatement ps = con.prepareStatement(insertar);

            ps.setString(1, bean.getNombre());
            ps.setInt(2, bean.getNumeroDePreguntas());
            ps.setInt(3, bean.getTipoRespuestas());

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

    public int getLastIndex() {
        int index = 99;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement("SELECT LAST_INSERT_ID()");

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                index = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("PreguntaDAO/getLastIndex: " + ex.getMessage());
        }

        return index;
    }
}
