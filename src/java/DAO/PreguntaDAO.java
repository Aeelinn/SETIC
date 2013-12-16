/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.EncuestaBean;
import Bean.PreguntaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aya
 */
public class PreguntaDAO {

    private final String consulta = "SELECT * FROM Pregunta WHERE encuestaIdencuesta = ?";
    private final String insertar = "INSERT INTO Pregunta VALUES(NULL, ?, ?)";

    public List<PreguntaBean> consultar(EncuestaBean encuesta) {
        List<PreguntaBean> ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);

            ps.setInt(1, encuesta.getEncuestaIdencuesta());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PreguntaBean bean = new PreguntaBean(
                        rs.getInt(1),
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

            ps.setInt(1, bean.getEncuestaIdencuesta());
            ps.setString(2, bean.getContenido());

            estado = ps.executeUpdate() != 0;
        } catch (SQLException ex) {
            System.out.println("PreguntaDAO/insertar: " + ex.getMessage());
        }

        return estado;
    }
}
