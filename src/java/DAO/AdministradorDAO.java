/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.AdministradorBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aya
 */
public class AdministradorDAO {

    private final String getAdmin
            = "SELECT * FROM Administrador WHERE idAdministrador = 1";
    private final String setNombre
            = "UPDATE Administrador SET nombre = ? WHERE id = 1";
    private final String setContraseña
            = "UPDATE Administrador SET contraseña = ? WHERE id = 1";

    public AdministradorBean getAdmin() {
        AdministradorBean admin = null;

        try {
            PreparedStatement ps = MySQL_Connection.getConection()
                    .prepareStatement(getAdmin);

            ResultSet rs = ps.executeQuery();

            //while (rs.next()) {
            rs.next();
            String user = rs.getString("nombre");
            String pass = rs.getString("contraseña");

            admin = new AdministradorBean(user, pass);
            //}

            ps.close();
        } catch (SQLException ex) {
            System.out.println("AdministradorDAO/getAdmin: " + ex.getLocalizedMessage());
        }

        return admin;
    }

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
