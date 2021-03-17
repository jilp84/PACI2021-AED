package robot;

public class Robot{

    //PROPIEDADES
    private String estado;
    private boolean encontrado;
    private int velocidad;
    private float temperatura;
    private String modelo;
    
    //GETTER & SETTER
    public String getEstado(){
        
        return this.estado;
    
    }    
    
    public void setEstado(String estado){
    
        this.estado = estado;
        
    }

    public boolean getEncontrado(){
    
        return this.encontrado;
    
    }
    
    public void setEncontrado(boolean encontrado){
    
        if (encontrado) {
            this.setEstado("Volviendo a casa...");
            this.setVelocidad(180);
        }        
        
        this.encontrado = encontrado;
    
    }
    
    public int getVelocidad(){
    
        return this.velocidad;
    
    }
    
    public void setVelocidad(int velocidad){
        
        if (this.getTemperatura() > 100) {
            velocidad = 80;
        }
        
        this.velocidad = velocidad;
    
    }
    
    public float getTemperatura(){
    
        return this.temperatura;
    
    }
    
    public void setTemperatura(float temperatura){
    
        if (temperatura > 100) {
            setVelocidad(80);
        }
        
        this.temperatura = temperatura;
    
    }
    
    public String getModelo(){
    
        return this.modelo;
    
    }
    
    public void setModelo(String modelo){
    
        this.modelo = modelo;
    
    }
    
    
    //METODOS
    @Override
    public String toString(){
    
        return "MODELO: " + this.getModelo() + "\n" 
             + "ESATDO: " + this.getEstado() + "\n"
             + "VELOCIDAD: " + this.getVelocidad() + "\n"
             + "TEMPERATURA: " + this.getTemperatura() + "\n"
             + "ENCONTRADO: " + this.getEncontrado(); 
    
    }
    
}
