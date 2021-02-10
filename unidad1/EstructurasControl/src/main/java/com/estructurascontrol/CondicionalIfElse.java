
package com.estructurascontrol;

import java.util.Scanner;

public class CondicionalIfElse{

    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        int nota = leer.nextInt();
        
        if(nota < 70){
            System.err.println("El alumno esta reprobado.");
            /* If anidado
            if(){
            
            }
            */
        }else{
            System.out.println("El alumno esta aprobado.");
        }
        
    }

}