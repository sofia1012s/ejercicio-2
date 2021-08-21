public class Perro
{
    private String nombre;
    private String color;
    private String salud;
    private String edad;
    private String tamano;
    private String raza;
    private boolean refugiado = false;

    public Perro(String nombre, String color, String salud, String edad, String tamano, String raza, boolean refugiado)
    {
        this.nombre = nombre;
        this.color = color;
        this.salud = salud;
        this.edad = edad;
        this.tamano = tamano;
        this.raza = raza;
        this.refugiado = refugiado;
    }

    public void setEstado(){
        refugiado = true;
    }

    public String getNombre(){
        return nombre;
    }

    public String getColor()
    {
        return color;
    }

    public String getSalud()
    {
        return salud;
    }

    public String getEdad()
    {
        return edad;
    }

    public String getTamano()
    {
        return tamano;
    }

    public String getRaza()
    {
        return raza;
    }

    public boolean getEstado()
    {
        return refugiado;
    }
}