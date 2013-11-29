/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.AdministradorBean;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aya
 */
public class AdministradorDAO {

    private final String setNombre
            = "UPDATE Administrador SET nombre = ? WHERE id = 1";
    private final String setContraseña
            = "UPDATE Administrador SET contraseña = ? WHERE id = 1";

    public void setNombre(AdministradorBean bean) {
        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(setNombre);

            ps.setString(1, bean.getNombre());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("AdministradorDAO/setNombre: " + ex.getMessage());
        }
    }

    public void setContraseña(AdministradorBean bean) {
        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(setContraseña);

            ps.setString(1, bean.getContraseña());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("AdministradorDAO/setContraseña: " + ex.getMessage());
        }
    }
}
