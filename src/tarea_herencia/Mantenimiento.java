/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Mantenimiento extends Empleado{
    private String areaEspecialidad;

    public Mantenimiento(String areaEspecialidad, String id, int salario, String site, String turno, String nombre, String apellidos, int edad) {
        super(id, salario, site, turno, nombre, apellidos, edad);
        this.areaEspecialidad = areaEspecialidad;
    }

    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.areaEspecialidad = areaEspecialidad;
    }
    
}
