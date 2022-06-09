/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Salud extends Empleado{
    private String especialidad;
    private String idProfesional;

    public Salud(String especialidad, String idProfesional, String id, int salario, String site, String turno, String nombre, String apellidos, int edad) {
        super(id, salario, site, turno, nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.idProfesional = idProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(String idProfesional) {
        this.idProfesional = idProfesional;
    }
    
    
}
