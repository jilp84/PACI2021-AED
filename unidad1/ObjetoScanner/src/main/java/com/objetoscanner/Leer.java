
package com.objetoscanner;

import java.util.Scanner;

public class Leer{

    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("------------------------------");
        
        System.out.println("Hola su nombre es: " + nombre +
                " y su edad es: " + edad);
        
        
    }
    
}