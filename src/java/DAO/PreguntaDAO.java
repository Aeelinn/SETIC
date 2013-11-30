/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.PreguntaBean;
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
public class PreguntaDAO {

    private final String consulta = "SELECT * FROM Pregunta";
    private final String insertar = "INSERT INTO Pregunta VALUES(?, ?, ?)";

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PreguntaBean bean = new PreguntaBean(
                        rs.getInt("idpreguntas"),
                        rs.getString("contenido"),
                        rs.getInt("encuestaIdencuesta"));
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("PreguntaDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(PreguntaBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setInt(1, bean.getIdpreguntas());
            ps.setInt(2, bean.getEncuestaIdencuesta());
            ps.setString(3, bean.getContenido());

            estado = ps.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return estado;
    }
}