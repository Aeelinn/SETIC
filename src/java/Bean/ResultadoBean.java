/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;

/**
 *
 * @author aya
 */
public class ResultadoBean implements Serializable {

    private int idResultado;
    private String respuesta;
    private int idpreguntas;
    private String matricula;

    public ResultadoBean(int idResultado, String respuesta, int idpreguntas, String matricula) {
        this.idResultado = idResultado;
        this.respuesta = respuesta;
        this.idpreguntas = idpreguntas;
        this.matricula = matricula;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdpreguntas() {
        return idpreguntas;
    }

    public void setIdpreguntas(int idpreguntas) {
        this.idpreguntas = idpreguntas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Bean.ResultadoBean[ idResultado=" + idResultado + " ]";
    }

}
