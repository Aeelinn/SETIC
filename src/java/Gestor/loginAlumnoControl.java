/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.AlumnoBean;
import DAO.AlumnoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author aya
 */
public class loginAlumnoControl {

    AlumnoDAO dao = new AlumnoDAO();

    public void insertar(AlumnoBean bean) {
        if (!dao.buscar(bean) && dao.insertar(bean)) {
            JOptionPane.showMessageDialog(null,
                    "Se ha registrado un nueva maticula: "
                    + bean.getMatricula());
        } else {
            String matricula = bean.getMatricula();
            JOptionPane.showMessageDialog(null, "La matricula ya existe: "
                    + matricula);
        }
    }
}
