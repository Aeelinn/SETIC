/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import Bean.RealizaBean;
import Bean.ResultadoBean;
import DAO.RealizaDAO;
import DAO.ResultadoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aya
 */
public class registrarResultadoControl {

    private final ResultadoDAO resultadoDao = new ResultadoDAO();
    private final RealizaDAO realizaDao = new RealizaDAO();

    public void insertarResultado(ResultadoBean bean) {
        resultadoDao.insertar(bean);
    }

    public void registrarRealizacion(String matricula, int idEncuesta) {
        int periodo = getPeriodo();
        RealizaBean bean = new RealizaBean(matricula, idEncuesta, periodo);

        realizaDao.insertar(bean);
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
