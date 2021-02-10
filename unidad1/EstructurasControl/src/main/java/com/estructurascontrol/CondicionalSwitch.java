
package com.estructurascontrol;

public class CondicionalSwitch{

    public static void main(String[] args){
    
        char genero = 'W';
        
        switch (genero){
        
            case 'F' : 
                System.out.println("Usted es mujer.");
                break;
            case 'M' : 
                System.out.println("Ustes es hombre");
                break;
            default: 
                System.out.println("No selecciono un genero");
                
        }
        
    
    }

}