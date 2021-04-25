
package estructuras;

/**
 *
 * @author josepalencia
 */
public class Persona {
    
    private String nombre;
    private String direccion;
    private String identidad;
    private String telefono;

    public Persona() {
        
    }

    
    
    public Persona(String nombre, String direccion, String identidad, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.identidad = identidad;
        this.telefono = telefono;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
