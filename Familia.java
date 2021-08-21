/******************************************************************************
 * Familia.java
 * 
 * @author Sofía Salguero
 * @version
 *
 *          Clase
 ******************************************************************************/
public class Familia {
    private Persona persona;
    private Perro perro;
    private String apellidoFamilia;
    private int ninosPequenos = 0;
    private int ninosGrades = 0;
    private int adultos = 0;
    private int perrosRefugiados = 0;
    private boolean disponibilidad = true;
    private Persona[] miembros;
    private Perro[] perros;

    public Familia(String apellido, Persona[] mie) {
        apellidoFamilia = apellido;
        miembros = mie;
    }

    public void setNuevoMiembro(String nombre, String apellido, int edad) {
        persona = new Persona(nombre, apellido, edad);
    }

    public void setPerro(String nombrep, String colorp, String saludp, String edadp, String tamanop, String razap, boolean refugiado) {
        perro = new Perro(nombrep, colorp, saludp, edadp,tamanop,razap,refugiado);
    }

    public void setDisponibilidad() {
        disponibilidad = false;
    }

    public String getApellido() {
        return apellidoFamilia;
    }

    public int getPerros() {
        return perrosRefugiados;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public int getPequenos(){
        return ninosPequenos;
    }

    public int getGrande(){
        return ninosGrades;
    }

    public int getAdultos(){
        return adultos;
    }
}
