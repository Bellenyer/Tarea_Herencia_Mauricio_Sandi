/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Administrativo extends Empleado {
    private String departamento;
    private String rol;

    public Administrativo(String departamento, String rol, String id, int salario, String site, String turno, String nombre, String apellidos, int edad) {
        super(id, salario, site, turno, nombre, apellidos, edad);
        this.departamento = departamento;
        this.rol = rol;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
