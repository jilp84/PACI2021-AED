
package practicas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author josepalencia
 */
public class CambiarTitulo extends JFrame implements ActionListener{
    
    JButton boton1 = new JButton("Algoritmos y estructuras de datos");
    JButton boton2 = new JButton("CUROC");
   
    public CambiarTitulo(){
        super("Barra de titulo");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        add(boton1);
        add(boton2);
        
        pack();
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        CambiarTitulo app = new CambiarTitulo();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        
        Object fuente = evt.getSource();
        
        if (fuente == boton1) {
            setTitle(tituloClase());
        } else if (fuente == boton2) {
            setTitle(tituloCentro());
        }
        
        
    }
    
    public String tituloClase(){
    
        return boton1.getText();
        
    }
    
    public String tituloCentro(){
    
        return boton2.getText();
        
    }
    
    
}
