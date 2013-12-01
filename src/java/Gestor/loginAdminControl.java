/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.AdministradorBean;
import DAO.AdministradorDAO;

/**
 *
 * @author aya
 */
public class loginAdminControl {

    AdministradorDAO dao = new AdministradorDAO();

    public boolean auntenticate(AdministradorBean bean) {
        AdministradorBean admin = dao.getAdmin();

        return (admin.toString().compareTo(bean.toString()) == 0);
    }
}
