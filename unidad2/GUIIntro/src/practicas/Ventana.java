package practicas;

import javax.swing.JFrame;

/**
 *
 * @author josepalencia
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        super("Recuerdo de mi primera ventana");
        //System.out.println("Desde el metodo constructor");
        
        setSize(620, 480);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        
        Ventana miVentana = new Ventana();
        //System.out.println("Despues de crear el objeto ventana");
    }
    
}
