package com.arreglos;

import java.util.Arrays;

public class Arreglos05{

    public static void main(String[] args) {
        
        String nombres[] = 
            {"Miguel",
             "Maria",
             "Alberto",
             "Fernando",
             "Alejandro",
             "Rosa",
             "Evaristo",
             "Bernardo",
             "Francisco",
             "Homero",
             "Cristina",
             "Carla",
             "Cesar"
            };
        
        System.out.println("Orden original:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i+1) + ": " + nombres[i]);
        }
        
        Arrays.sort(nombres);
        
        System.out.println("Nuevo Orden");
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i+1) + ": " + nombres[i]);
        }
    }
    
}
