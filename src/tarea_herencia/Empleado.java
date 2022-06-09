/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Empleado extends Persona{
    private String id;
    private int salario;
    private String site;
    private String turno;

    public Empleado(String id, int salario, String site, String turno, String nombre, String apellidos, int edad) {
        super (nombre, apellidos, edad);
        this.id = id;
        this.salario = salario;
        this.site = site;
        this.turno = turno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
   
    
    
}
