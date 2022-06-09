/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Seguridad extends Empleado{
    private String caseta;
    private String permisos;

    public Seguridad(String caseta, String permisos, String id, int salario, String site, String turno, String nombre, String apellidos, int edad) {
        super(id, salario, site, turno, nombre, apellidos, edad);
        this.caseta = caseta;
        this.permisos = permisos;
    }

    public String getCaseta() {
        return caseta;
    }

    public void setCaseta(String caseta) {
        this.caseta = caseta;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
    
    
}
