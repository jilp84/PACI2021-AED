
package practicas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author josepalencia
 */
public class MiBoton extends JFrame implements ActionListener{
    
    JButton boton1 = new JButton("Algoritmos y Estructura de Datos");
    int bandera = 0;
    public MiBoton(){
        super("Ejemplo boton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        boton1.addActionListener(this);
        
        FlowLayout d = new FlowLayout();
        setLayout(d);
        
        add(boton1);
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        MiBoton app = new MiBoton();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        bandera++;
        boton1.setActionCommand("CUROC" + bandera);
        boton1.setText(boton1.getActionCommand());
    }
    
}
