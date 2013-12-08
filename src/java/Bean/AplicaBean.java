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

    private int encuestaIdEncuesta;
    private int idAdministrador;
    private String fecha;

    public AplicaBean(int encuestaIdEncuesta, int idAdministrador, String fecha) {
        this.encuestaIdEncuesta = encuestaIdEncuesta;
        this.idAdministrador = idAdministrador;
        this.fecha = fecha;
    }

    public int getEncuestaIdEncuesta() {
        return encuestaIdEncuesta;
    }

    public void setEncuestaIdEncuesta(int encuestaIdEncuesta) {
        this.encuestaIdEncuesta = encuestaIdEncuesta;
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
