/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.AlumnoBean;
import DAO.AlumnoDAO;

/**
 *
 * @author aya
 */
public class loginAlumnoControl {

    AlumnoDAO dao = new AlumnoDAO();

    public void exist(AlumnoBean bean) {
        dao.buscar(bean);
    }
}
