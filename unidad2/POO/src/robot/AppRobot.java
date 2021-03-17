package robot;

/**
 *
 * @author josepalencia
 */
public class AppRobot {
    
    public static void main(String[] args) {
        
        Robot eva01 = new Robot();
        
        eva01.setEncontrado(false);
        eva01.setModelo("EVA01");
        eva01.setTemperatura(65);
        eva01.setVelocidad(120);
        eva01.setEstado("Buscando...");
        
        System.out.println(eva01.toString());
        
        System.out.println("------------------------------------");
        eva01.setEncontrado(true);
        System.out.println(eva01.toString());
        
        System.out.println("------------------------------------");
        eva01.setTemperatura(140);
        System.out.println(eva01.toString());
    }
    
}
