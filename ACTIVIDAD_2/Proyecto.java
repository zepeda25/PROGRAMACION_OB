/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import java.util.Scanner;
/**
 *
 * @author alanz
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        //SOLICITA AL USUARIO INGRESAR SU NOMBRE
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        //ESPECIFICA EL NOMBRE QUE QUIERES
        String nombreEspecifico = "Zepeda";
        // COMPARACION CON MAYUSCULAS Y MINUSCULAS
        if (nombre.equalsIgnoreCase(nombreEspecifico)) {
            System.out.print("¡Hola Ingeniero, " + nombreEspecifico + "! Has ingresado el nombre correcto bien por ti.");
            
        } else {
            System.out.print("Hola, " + nombre + ". Mmmm me parece que ese no es el nombre que buscamos.");
        }
    scanner.close();
    }
    
}
