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
public class PeriodoBean {

    private int idPeriodo;
    private String nombre;

    public PeriodoBean(int idPeriodo, String nombre) {
        this.idPeriodo = idPeriodo;
        this.nombre = nombre;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Bean.PeriodoBean[ idPeriodo=" + idPeriodo + " ]";
    }

}
