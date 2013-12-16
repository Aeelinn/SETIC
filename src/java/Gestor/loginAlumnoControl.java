/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.AlumnoBean;
import Bean.EncuestaBean;
import Bean.RealizaBean;
import DAO.AlumnoDAO;
import DAO.EncuestaDAO;
import DAO.PreguntaDAO;
import DAO.RealizaDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    RealizaDAO realizaDao = new RealizaDAO();

    public EncuestaBean getEncuesta() {
        EncuestaBean encuesta = encuestaDao.getEncuestaActiva();

        if (encuesta == null) {
            JOptionPane.showMessageDialog(null,
                    "No se ha activado ninguna encuesta", "Info", 1);
        }

        return encuesta;
    }

    public boolean validarUsuario(AlumnoBean bean, EncuestaBean encuesta) {
        if (!alumnoDao.buscar(bean)) {
            alumnoDao.insertar(bean);
            /*JOptionPane.showMessageDialog(null,
                    "Se ha registrado un nueva maticula: "
                    + bean.getMatricula());*/
        } else {
            String matricula = bean.getMatricula();
            int idEncuesta = encuesta.getEncuestaIdencuesta();
            int periodo = getPeriodo();

            RealizaBean realizaBean = new RealizaBean(matricula, idEncuesta, periodo);

            /*JOptionPane.showMessageDialog(null, "La matricula ya existe: "
                    + matricula);*/

            return realizaDao.buscar(realizaBean);
        }

        return false;
    }

    public List getPreguntas(EncuestaBean bean) {
        return preguntaDao.consultar(bean);
    }

    public int getPeriodo() {
        int periodo = 0;

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        int mes = Integer.parseInt(sdf.format(date));

        switch (mes) {
            case 1 | 2 | 3 | 4:
                periodo = 1;
                break;
            case 5 | 6 | 7 | 8:
                periodo = 2;
                break;
            default:
                periodo = 3;
        }

        return periodo;
    }
}
