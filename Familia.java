
/******************************************************************************
 * Familia.java
 * 
 * @author Sofía Salguero
 * @version 22/08/2021 
 * Clase Familia que se encarga de almacenar los datos de
 * cada familia y mantiene métodos para agregar nuevos miembros, nuevo
 *  perro y obtener datos de la familia.
 ******************************************************************************/
public class Familia {
    private String apellidoFamilia;
    private int ninosPequenos;
    private int ninosGrades;
    private int adultos;
    private int perrosRefugiados;
    private boolean disponibilidad;
    private int cantidad = 1;
    private int cantidadp = 1;
    private Persona[] miembros = new Persona[cantidad];
    private Perro[] perros = new Perro[cantidadp];

    /**
     * 
     * @param apellidoFam
     * @param np
     * @param ng
     * @param a
     * @param pr
     * @param d           Constructor, se toman los datos de cada familia
     */
    public Familia(String apellidoFam, int np, int ng, int a, int pr, boolean d, int cp) {
        apellidoFamilia = apellidoFam;
        ninosPequenos = np;
        ninosGrades = ng;
        adultos = a;
        perrosRefugiados = pr;
        disponibilidad = d;
        cantidadp = cp;
    }

    /**
     * @param perrito Método que se encarga de agregar un nuevo perro al array de
     *                perros que tiene la familia
     */
    public void nuevoPerro(Perro perrito) {
        for (int i = 0; i < perros.length; i++) {
            if (perros[i] == null) {
                perros[i] = perrito;
            }
        }

        if (perros.length == 4) {
            disponibilidad = false;
        }
    }

    /**
     * @param miembrofam Método para añadir nuevo miembro a la familia
     */
    public void nuevoMiembro(Persona miembrofam) {
        for (int i = 0; i < miembros.length; i++) {
            if (miembros[i] == null) {
                miembros[i] = miembrofam;
                cantidad++;
            }
        }
    }

    /**
     * Métodos para indicar que la familia ya no se encuentra disponible para
     * adoptar un perro
     */
    public void setDisponibilidad() {
        disponibilidad = false;
    }

    /**
     * @return String Método que indica el apellido de la familia
     */
    public String getApellido() {
        return apellidoFamilia;
    }

    /**
     * @return int Método que indica la cantidad de perros que posee la familia
     */
    public int getPerros() {
        perrosRefugiados = perros.length;
        return perrosRefugiados;
    }

    /**
     * @return boolean Método que indica si la familia se encuentra disponible para
     *         adoptar más perro o no
     */
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @return int Método para obtener la cantidad de niños pequeños que tiene la
     *         familia
     */
    public int getPequenos() {
        for (int i = 0; i < miembros.length; i++) {
            if (miembros[i].getEdad() <= 10) {
                ninosPequenos++;
            }
        }
        return ninosPequenos;
    }

    /**
     * @return int Método para obtener la cantidad de niños grandes que tiene la
     *         familia
     */
    public int getGrande() {
        for (int i = 0; i < miembros.length; i++) {
            if (miembros[i].getEdad() > 10 && miembros[i].getEdad() < 18) {
                ninosGrades++;
            }
        }
        return ninosGrades;
    }

    /**
     * @return int Método para obtener la cantidad de adultos que tiene la familia
     */
    public int getAdultos() {
        for (int i = 0; i < miembros.length; i++) {
            if (miembros[i].getEdad() > 18) {
                adultos++;
            }
        }
        return adultos;
    }
}
