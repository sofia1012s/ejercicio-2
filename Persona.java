/******************************************************************************
 * Persona.java
 * 
 * @author Sofía Salguero
 * @version 22/08/2021 
 * Clase Persona que se encarga de crear cada miembro de la
 * familia, por lo que unicamente sirve para indicar los datos de cada miembro
 ******************************************************************************/
public class Persona {
    private String nombre;
    private int edad;

    /**
     * 
     * @param nombre
     * @param edad   Constructor, almacena los datos de la instancia de la clase
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return String Método que regresa el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return int Método que regresa la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

}
