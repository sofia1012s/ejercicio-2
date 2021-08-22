/**
 * @author Sofía Salguero
 * @version 22/08/2021
 * 
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

/**
 * 
 * @param nombre 
 * @param apellido
 * @param edad
 */
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
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

    
    /** 
     * @return String
     */
    public String getFamilia()
    {
        return apellido;
    }
}

