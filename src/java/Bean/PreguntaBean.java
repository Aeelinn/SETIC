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
public class PreguntaBean {

    private int idpreguntas;
    private String contenido;
    private int encuestaIdencuesta;

    public PreguntaBean(int idpreguntas, String contenido, int encuestaIdencuesta) {
        this.idpreguntas = idpreguntas;
        this.contenido = contenido;
        this.encuestaIdencuesta = encuestaIdencuesta;
    }

    public int getIdpreguntas() {
        return idpreguntas;
    }

    public void setIdpreguntas(int idpreguntas) {
        this.idpreguntas = idpreguntas;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getEncuestaIdencuesta() {
        return encuestaIdencuesta;
    }

    public void setEncuestaIdencuesta(int encuestaIdencuesta) {
        this.encuestaIdencuesta = encuestaIdencuesta;
    }

    @Override
    public String toString() {
        return "Bean.PreguntaBean[ idpreguntas=" + idpreguntas + " ]";
    }

}
