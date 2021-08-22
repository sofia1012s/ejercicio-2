/**
 * @author Sofía Salguero
 * @version 22/08/2021
 * 
 */
public class Persona {
    private String nombre;
    private int edad;

/**
 * 
 * @param nombre 
 * @param edad
 */
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    
    /** 
     * @return String
     */
    public String getNombre()
    {
        return nombre;
    }

    
    
    /** 
     * @return int
     */
    public int getEdad(){
        return edad;
    }

}

