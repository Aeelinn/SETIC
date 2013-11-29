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
public class RealizaBean {

    private int idgenera;
    private int idPeriodo;
    private int encuestaIdencuesta;
    private String alumnoMatricula;

    public RealizaBean(int idgenera, int idPeriodo, int encuestaIdencuesta, String alumnoMatricula) {
        this.idgenera = idgenera;
        this.idPeriodo = idPeriodo;
        this.encuestaIdencuesta = encuestaIdencuesta;
        this.alumnoMatricula = alumnoMatricula;
    }

    public int getIdgenera() {
        return idgenera;
    }

    public void setIdgenera(int idgenera) {
        this.idgenera = idgenera;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getEncuestaIdencuesta() {
        return encuestaIdencuesta;
    }

    public void setEncuestaIdencuesta(int encuestaIdencuesta) {
        this.encuestaIdencuesta = encuestaIdencuesta;
    }

    public String getAlumnoMatricula() {
        return alumnoMatricula;
    }

    public void setAlumnoMatricula(String alumnoMatricula) {
        this.alumnoMatricula = alumnoMatricula;
    }

    @Override
    public String toString() {
        return "Bean.RealizaBean[ idgenera=" + idgenera + " ]";
    }

}
