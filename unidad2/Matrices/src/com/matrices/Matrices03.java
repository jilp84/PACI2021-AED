package com.matrices;

import java.util.Scanner;

/**
 *
 * @author josepalencia
 */
public class Matrices03 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[][] numeros = new int[2][4];
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingrese [" + i + "," + j + "]:");
                numeros[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("---------------------------------");
        
        System.out.println("Filas: " + numeros.length);
        System.out.println("Columnas: " + numeros[0].length);
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                //System.out.println("[" + i + "," + j + "] = " + numeros[i][j]);
                if (j < (numeros[i].length - 1)) {
                    //System.out.println("J + " + j);
                    System.out.print(numeros[i][j] + "\t");
                }else{
                    System.out.println(numeros[i][j]);
                }
                
            }
        }
        
    }
    
}
