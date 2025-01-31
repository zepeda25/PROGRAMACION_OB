/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;
import java.util.Scanner;


/**
 *
 * @author alanz
 */
public class Numeros {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre:");
        
        // Leer el nombre ingresado por el usuario
        String nombre = scanner.nextLine();
        
                // Mostrar un mensaje de bienvenida
        System.out.println("Hola, " + nombre + "! Vamos a generar una lista de números pares.");
        
                // Crear un arreglo para almacenar los números pares
        int[] numerosPares = new int[50];
        
                // Llenar el arreglo con números enteros pares desde 2 hasta 100
        for (int i = 0, num = 2; i < numerosPares.length; i++, num += 2) {
            numerosPares[i] = num;
            
        }
                // Recorrer el arreglo y mostrar los números almacenados
        System.out.println("Números pares de 2 a 100:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println(numerosPares[i]);
        }
        scanner.close();
    }
    
}
