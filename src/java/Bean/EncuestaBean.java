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

    private int idencuesta;
    private String nombre;
    private int numeroDePreguntas;
    private int tipoRespuestas;

    public EncuestaBean(int idencuesta, String nombre, int numeroDePreguntas, int tipoRespuestas) {
        this.idencuesta = idencuesta;
        this.nombre = nombre;
        this.numeroDePreguntas = numeroDePreguntas;
        this.tipoRespuestas = tipoRespuestas;
    }

    public int getIdencuesta() {
        return idencuesta;
    }

    public void setIdencuesta(int idencuesta) {
        this.idencuesta = idencuesta;
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

    @Override
    public String toString() {
        return "Bean.EncuestaBean[ idencuesta=" + idencuesta + " ]";
    }

}
