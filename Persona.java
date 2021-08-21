/******************************************************************************
*Persona.java
*@author Sofía Salguero
*@version 
*
*Clase 
******************************************************************************/
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getFamilia()
    {
        return apellido;
    }
}

