
package com.arreglos;

import java.util.Scanner;

public class Arreglos02{

    public static void main(String[] args){
    
        Scanner leer = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
        }
        
        System.out.println("--------------------------------");
        
        for(int i = 0; i < 5; i++){
            
            System.out.println(numeros[i]);
            
        }
        
    }

}