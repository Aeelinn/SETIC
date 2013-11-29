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
public class AplicaBean {

    private int encuestaIdencuesta;
    private int idAdministrador;
    private String fecha;

    public AplicaBean(int encuestaIdencuesta, int idAdministrador, String fecha) {
        this.encuestaIdencuesta = encuestaIdencuesta;
        this.idAdministrador = idAdministrador;
        this.fecha = fecha;
    }

    public int getEncuestaIdencuesta() {
        return encuestaIdencuesta;
    }

    public void setEncuestaIdencuesta(int encuestaIdencuesta) {
        this.encuestaIdencuesta = encuestaIdencuesta;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
