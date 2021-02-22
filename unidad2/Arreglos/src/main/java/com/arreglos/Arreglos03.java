package com.arreglos;

public class Arreglos03{

    public static void main(String[] args) {
        
        String[] impresoras = {"Canon",
                               "Dell",
                               "Epson",
                               "HP",
                               "Lexmark",
                               "Samsung"};
        
        System.out.println("Hay " + impresoras.length +
                " marcas de impresoras");
        
        for(int i=0; i<impresoras.length; i++){
            System.out.println("Marca No. " + (i+1) + ". " 
                    + impresoras[i] );
        }
    }
    
}
