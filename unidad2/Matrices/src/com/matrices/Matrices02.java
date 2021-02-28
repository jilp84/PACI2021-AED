
package com.matrices;

/**
 *
 * @author josepalencia
 */
public class Matrices02 {

    public static void main(String[] args) {
        
        int[][] numeros = {
                            {20, 15, 200, 4},
                            {12, 33, 110, 10}
                          };
        System.out.print(numeros[0][0] + "\t" + 
                         numeros[0][1] + "\t" +
                         numeros[0][2] + "\t" +
                         numeros[0][3] + "\n"
                        );
        System.out.print(numeros[1][0] + "\t" + 
                         numeros[1][1] + "\t" +
                         numeros[1][2] + "\t" +
                         numeros[1][3] + "\n"
                        );
        
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
