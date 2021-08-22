
/******************************************************************************
 * Familia.java
 * 
 * @author Sofía Salguero
 * @version
 *
 *          Clase
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
 * @param d
 */
    public Familia(String apellidoFam, int np, int ng, int a, int pr, boolean d,int cp) {
        apellidoFamilia = apellidoFam;
        ninosPequenos = np;
        ninosGrades = ng;
        adultos = a;
        perrosRefugiados = pr;
        disponibilidad = d;
        cantidadp = cp;
    }

    public void nuevoPerro(Perro perrito) {
        for(int i = 0; i < perros.length; i++) {
            if (perros[i]==null){
            perros[i] = perrito;}
        }

        if (perros.length == 4) {
            disponibilidad = false;
        }
    }

    
    /** 
     * @param miembrofam
     */
    public void nuevoMiembro(Persona miembrofam) {
        for(int i = 0; i < miembros.length; i++){
            if (miembros[i]==null){
            miembros[i] = miembrofam;
            cantidad++;}
        }
    }

    public void setDisponibilidad() {
        disponibilidad = false;
    }

    
    /** 
     * @return String
     */
    public String getApellido() {
        return apellidoFamilia;
    }

    
    /** 
     * @return int
     */
    public int getPerros() {
        perrosRefugiados = perros.length;
        return perrosRefugiados;
    }

    
    /** 
     * @return boolean
     */
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    
    /** 
     * @return int
     */
    public int getPequenos(){
        for(int i = 0; i < miembros.length; i++)
        {
            if (miembros[i].getEdad() <= 10)
            {
                ninosPequenos++;
            }
        }
        return ninosPequenos;
    }

    
    /** 
     * @return int
     */
    public int getGrande() {
        for(int i = 0; i < miembros.length; i++)
        {
            if (miembros[i].getEdad() > 10 && miembros[i].getEdad() < 18)
            {
                ninosGrades++;
            }
        }
        return ninosGrades;
    }

    
    /** 
     * @return int
     */
    public int getAdultos() {
        for(int i = 0; i < miembros.length; i++)
        {
            if (miembros[i].getEdad() > 18)
            {
                adultos++;
            }
        }
        return adultos;
    }

    
    /** 
     * @return String
     */
    public String getMiembros() {
        String str = "";
        for(int i = 0; i < miembros.length; i++) {
            str += miembros[i] + "\n";
            i++;
        }
        return str;
    }
}
