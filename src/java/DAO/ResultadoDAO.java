/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.ResultadoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aya
 */
public class ResultadoDAO {

    private final String consulta = "SELECT * FROM Resultado";
    private final String insertar = "INSERT INTO Resultado VALUES(?, ?, ?, ?)";

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ResultadoBean bean = new ResultadoBean(
                        rs.getString("respuesta"),
                        rs.getInt("idpreguntas"),
                        rs.getString("matricula")
                );
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("RealizaDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(ResultadoBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setInt(1, bean.getIdResultado());
            ps.setString(2, bean.getMatricula());
            ps.setInt(3, bean.getIdpreguntas());
            ps.setString(4, bean.getRespuesta());

            estado = ps.executeUpdate() != 0;
        } catch (SQLException ex) {
            System.out.println("ResultadoDAO/insertar: " + ex.getMessage());
        }

        return estado;
    }
}
