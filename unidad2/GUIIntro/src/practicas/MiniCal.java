
package practicas;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author josepalencia
 */
public class MiniCal extends JFrame implements FocusListener{
    
    JTextField txtValor1 = new JTextField("0", 5);
    JTextField txtValor2 = new JTextField("0", 5);
    JTextField txtResultado = new JTextField("0", 5);
    
    public MiniCal(){
        super("Sumar numeros");
        setSize(350, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        JLabel lblMas = new JLabel("+");
        JLabel lblIgual = new JLabel("=");
        
        txtValor1.addFocusListener(this);
        txtValor2.addFocusListener(this);
        
        txtResultado.setEditable(false);
        
        add(txtValor1);
        add(lblMas);
        add(txtValor2);
        add(lblIgual);
        add(txtResultado);
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        MiniCal app = new MiniCal();
    }

    @Override
    public void focusGained(FocusEvent arg0) {
        
        float v1 = Float.parseFloat(txtValor1.getText());
        float v2 = Float.parseFloat(txtValor2.getText());
        float resultado = v1 + v2;
        
        txtResultado.setText(Float.toString(resultado));
        
    }

    @Override
    public void focusLost(FocusEvent arg0) {
        focusGained(arg0);
    }
    
}
