/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Transporte extends Empleado{
    private String tipoLicencia;
    private String ruta;

    public Transporte(String tipoLicencia, String ruta, String id, int salario, String site, String turno, String nombre, String apellidos, int edad) {
        super(id, salario, site, turno, nombre, apellidos, edad);
        this.tipoLicencia = tipoLicencia;
        this.ruta = ruta;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
}
