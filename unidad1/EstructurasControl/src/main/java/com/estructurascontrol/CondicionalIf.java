
package com.estructurascontrol;

import java.util.Scanner;

/*
* > mayor que
* < menor que
* <= menor o igual
* >=mayor o igual
* == igual
* && and
* || or
*/

public class CondicionalIf{

    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        int nota = leer.nextInt();
        
        if(nota < 70){
            System.err.println("El alumno esta reprobado.");
        }
        
        if(nota >= 70){
            System.out.println("El alumno esta aprobado.");
        }
    
    }

}