/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.EncuestaBean;
import Bean.PreguntaBean;
import DAO.EncuestaDAO;
import DAO.PreguntaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author aya
 */
public class generarEncuestaControl {

    private final EncuestaDAO encuestaDao = new EncuestaDAO();
    private final PreguntaDAO preguntaDao = new PreguntaDAO();

    public void insertar(EncuestaBean bean, String preguntas[]) {
        if (!encuestaDao.existe(bean)) {
            int cnt = encuestaDao.insertar(bean);

            for (int i = 0; i < preguntas.length - 1; i++) {
                PreguntaBean pregunta = new PreguntaBean(preguntas[i], cnt);
                preguntaDao.insertar(pregunta);
            }
            
            JOptionPane.showMessageDialog(null,
                    "Se ha creado una nueva encuesta: " + cnt,
                    "Info", 1);
        } else {
            JOptionPane.showMessageDialog(null,
                    "La encuesta ya existe",
                    "Info", 1);
        }
    }
}
