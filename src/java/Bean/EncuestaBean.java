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
public class EncuestaBean {

    private int encuestaIdencuesta;
    private String nombre;
    private int numeroDePreguntas;
    private int tipoRespuestas;
    private String activoInicial;
    private String activoFinal;

    public EncuestaBean(String nombre, int numeroDePreguntas, int tipoRespuestas, String activoInicial, String activoFinal) {
        this.nombre = nombre;
        this.numeroDePreguntas = numeroDePreguntas;
        this.tipoRespuestas = tipoRespuestas;
        this.activoInicial = activoInicial;
        this.activoFinal = activoFinal;
    }

    public int getEncuestaIdencuesta() {
        return encuestaIdencuesta;
    }

    public void setEncuestaIdencuesta(int encuestaIdencuesta) {
        this.encuestaIdencuesta = encuestaIdencuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDePreguntas() {
        return numeroDePreguntas;
    }

    public void setNumeroDePreguntas(int numeroDePreguntas) {
        this.numeroDePreguntas = numeroDePreguntas;
    }

    public int getTipoRespuestas() {
        return tipoRespuestas;
    }

    public void setTipoRespuestas(int tipoRespuestas) {
        this.tipoRespuestas = tipoRespuestas;
    }

    public String getActivoInicial() {
        return activoInicial;
    }

    public void setActivoInicial(String activoInicial) {
        this.activoInicial = activoInicial;
    }

    public String getActivoFinal() {
        return activoFinal;
    }

    public void setActivoFinal(String activoFinal) {
        this.activoFinal = activoFinal;
    }
}
