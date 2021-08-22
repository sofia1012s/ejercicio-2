
public class Perro
{
    private String nombre;
    private String color;
    private String salud;
    private String edad;
    private int tamano;
    private int raza;
    private boolean refugiado;

    public Perro(String nombrep, String colorp, String saludp, String edadp, int tamanop, int razap, boolean refugiadop)
    {
        nombre = nombrep;
        color = colorp;
        salud = saludp;
        edad = edadp;
        tamano = tamanop;
        raza = razap;
        refugiado = refugiadop;

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

    public int getTamano()
    {
        return tamano;
    }

    public int getRaza()
    {
        return raza;
    }

    public boolean getEstado()
    {
        return refugiado;
    }
}