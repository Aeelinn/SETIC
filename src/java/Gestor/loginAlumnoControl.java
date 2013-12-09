/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.AlumnoBean;
import Bean.EncuestaBean;
import DAO.AlumnoDAO;
import DAO.EncuestaDAO;
import DAO.PreguntaDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aya
 */
public class loginAlumnoControl {

    AlumnoDAO alumnoDao = new AlumnoDAO();
    EncuestaDAO encuestaDao = new EncuestaDAO();
    PreguntaDAO preguntaDao = new PreguntaDAO();

    public EncuestaBean getEncuesta(AlumnoBean bean) {
        if (!alumnoDao.buscar(bean) && alumnoDao.insertar(bean)) {
            JOptionPane.showMessageDialog(null,
                    "Se ha registrado un nueva maticula: "
                    + bean.getMatricula());
        } else {
            String matricula = bean.getMatricula();
            JOptionPane.showMessageDialog(null, "La matricula ya existe: "
                    + matricula);
        }

        EncuestaBean encuesta = encuestaDao.getEncuestaActiva();

        if (encuesta == null) {
            JOptionPane.showMessageDialog(null,
                    "No se ha activado ninguna encuesta", "Info", 1);
        }

        return encuesta;
    }

    public List getPreguntas(EncuestaBean bean) {
        return preguntaDao.consultar(bean);
    }
}
