package practicas;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author josepalencia
 */
public class URLTest extends JFrame{
    
    public URLTest(){
        super("URL");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblURL = new JLabel("Direccion pagina web: ", JLabel.RIGHT);
        JTextField txtURL = new JTextField("Escriba aqui", 30);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        add(lblURL);
        add(txtURL);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        URLTest miVentana = new URLTest();
    }
    
}
