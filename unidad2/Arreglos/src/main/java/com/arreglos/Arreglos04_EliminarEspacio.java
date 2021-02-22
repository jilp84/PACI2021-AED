package com.arreglos;

public class Arreglos04_EliminarEspacio{

    public static void main(String[] args) {
        String citaDiaria = "La educación consiste en enseñar a los hombres "
            + "y mujeres no lo que deben pensar sino a pensar.\n";
    
        char[] convertir = citaDiaria.toCharArray();
    
        System.out.println("Total de caracteres: " + convertir.length);
        
        for (int i = 0; i < convertir.length; i++) {
            
            char actual  = convertir[i];
            
            if (actual != ' ') {
                System.out.print(actual);
            }
            
        }
        
    }
    
}
