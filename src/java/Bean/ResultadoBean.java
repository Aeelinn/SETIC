/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author aya
 */
public class ResultadoBean {

    private int idResultado;
    private String matricula;
    private int idpreguntas;
    private String respuesta;

    public ResultadoBean(String matricula, int idpreguntas, String respuesta) {
        this.matricula = matricula;
        this.idpreguntas = idpreguntas;
        this.respuesta = respuesta;
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
