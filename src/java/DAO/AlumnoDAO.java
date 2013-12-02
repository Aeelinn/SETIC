/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.AlumnoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aya
 */
public class AlumnoDAO {

    private final String consulta = "SELECT * FROM Alumno";
    private final String insertar = "INSERT INTO Alumno VALUES(?)";

    public void buscar(AlumnoBean bean) {
        try {
            String buscar = "SELECT * FROM Alumno WHERE matricula = '"
                    + bean.getMatricula() + "'";
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(buscar);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String matricula = rs.getString("matricula");
                JOptionPane.showMessageDialog(null, "La matricula ya existe: "
                        + matricula);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Se ha registrado un nueva maticula: "
                        + bean.getMatricula());
                insertar(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("AlumnoDAO/buscar: " + ex.getMessage());
        }
    }

    public List consultar() {
        List ls = new ArrayList();

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                AlumnoBean bean = new AlumnoBean(rs.getString("matricula"));
                ls.add(bean);
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("AlumnoDAO/consultar: " + ex.getMessage());
        }

        return ls;
    }

    public boolean insertar(AlumnoBean bean) {
        boolean estado = false;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(insertar);

            ps.setString(1, bean.getMatricula());

            estado = ps.executeUpdate() != 0;
            ps.close();
        } catch (SQLException ex) {
            System.out.println("AlumnoDAO/insertar: " + ex.getMessage());
        }

        return estado;
    }
}
