
/******************************************************************************
 * Perro.java
 * 
 * @author Sofía Salguero
 * @version 22/08/2021 
 * Clase Perro que se encarga de almacenar los datos de cada
 * nuevo perro ingresado a la perrera
 ******************************************************************************/
public class Perro {
    private String nombre;
    private String color;
    private String salud;
    private String edad;
    private int tamano;
    private int raza;
    private boolean refugiado;

    /**
     * 
     * @param nombrep
     * @param colorp
     * @param saludp
     * @param edadp
     * @param tamanop
     * @param razap
     * @param refugiadop
     * 
     * Método constructor que almacena los datos de cada nueva
     * instancia de perro
     */
    public Perro(String nombrep, String colorp, String saludp, String edadp, int tamanop, int razap,
            boolean refugiadop) {
        nombre = nombrep;
        color = colorp;
        salud = saludp;
        edad = edadp;
        tamano = tamanop;
        raza = razap;
        refugiado = refugiadop;

    }

    /**
     * Método para indicar que el perro ya ha sido refugiado
     */
    public void setEstado() {
        refugiado = true;
    }

    /**
     * @return String Método para obtener nombre del perro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return String Método para obtener color del perro
     * 
     */
    public String getColor() {
        return color;
    }

    /**
     * @return String Método para obtener salud del perro
     */
    public String getSalud() {
        return salud;
    }

    /**
     * @return String Método para obtener edad del perro
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @return int Método para obtener tamaño del perro
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @return int Método para obtener raza del perro
     */
    public int getRaza() {
        return raza;
    }

    /**
     * @return boolean Método para obtener estado del perro (si ha sido refugiado o
     *         no)
     */
    public boolean getEstado() {
        return refugiado;
    }
}