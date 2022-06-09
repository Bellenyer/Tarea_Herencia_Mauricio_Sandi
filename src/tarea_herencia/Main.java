/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_herencia;

/**
 *
 * @author Mauricio Sandi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produccion produc1 = new Produccion(95, 100, "APAC", "S&S", "B36510", 550000,
                             "Belen", "Turno A", "Mauricio", "Sandi Montero", 28);
        
        System.out.println("El empleado "+produc1.getNombre()+" "+produc1.getApellidos()+" tiene una productividad de: "+produc1.getProductividad()+"%");
    }
    
}
