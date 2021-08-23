
/******************************************************************************
 * Vista.java
 * 
 * @author Sofía Salguero
 * @version 22/08/2021 
 * Clase Vista que se encarga de ofrecer la interfaz al usuario para que pueda
 * interactuar con el programa
 ******************************************************************************/
import java.util.Scanner;

public class Vista {
    private Scanner scan = new Scanner(System.in);

    /**
     * Método para mostrar el mensaje de bienvenida al programa
     */
    public void bienvenida() {
        System.out
                .println("\n***************************** Hogares temporales para canes *****************************");
        System.out.println("Bienvenid@, muchas gracias por apoyar a estos perritos.");
    }

    /**
     * @return int Método para mostrar el menú de opciones y escoger una opción
     */
    public int menuOpciones() {
        int op = 0;
        String s = "\nQue desea hacer?\n" + "1. Ingresar nuevo perro\n" + "2. Ingresar nueva familia\n"
                + "3. Asignar perro a familia\n" + "4. Salir";

        System.out.println(s);
        op = scan.nextInt();
        return op;
    }

    /**
     * Método para mostrar el mensaje de salida cuando se cierra el programa
     */
    public void despedida() {
        System.out.println("\nGracias por usar el programa. Sigamos rescatando perros!");
    }

    /**
     * Método para indicar que se ha escogido una opción inválida
     */
    public void opcionInvalida() {
        System.out.println("Ha elegido una opcion invalida.");
    }

    /**
     * Método para indicar que se desea agregar un nuevo perro y se deben tomar sus
     * datos
     */
    public void nuevoPerro() {
        System.out.println("\nPor favor ingrese los datos del perro: ");
    }

    /**
     * @return String Método para ingresar el nombre del perro
     */
    public String nombrePerro() {
        String nombrep = "";
        System.out.println("\nNombre: ");
        nombrep = scan.next();

        return nombrep;
    }

    /**
     * @return String Método para ingresar el color del perro
     */
    public String colorPerro() {
        String colorp = "";
        System.out.println("\nColor: ");
        colorp = scan.next();

        return colorp;
    }

    /**
     * @return String Método para ingresar la salud del perro
     */
    public String saludPerro() {
        String saludp = "";
        System.out.println("\nSalud (entre 0 a 10): ");
        saludp = scan.next();

        return saludp;
    }

    /**
     * @return String Método para ingresar la edad del perro
     */
    public String edadPerro() {
        String edadp = "";
        System.out.println("\nEdad: (no coloque espacios) ");
        edadp = scan.next();

        return edadp;
    }

    /**
     * @return int Método para ingresar el tamaño del perro
     */
    public int tamanoPerro() {
        int tamanop = 0;
        System.out.println("\nTamano (pequeno = 1, mediano =2 , grande = 3): ");
        tamanop = scan.nextInt();

        return tamanop;
    }

    /**
     * @return int Método para ingresar la raza del perro
     */
    public int razaPerro() {
        int razap = 0;

        String s = "\nRaza (coloque el numero de la raza correspondiente):\n"
                + "1. Pit bull terrier                10. Mastin napolitano\n"
                + "2. American Staffordshire terrier  11. Presa Mallorqui\n"
                + "3. Tosa Inu                        12. Dogo de burdeos\n"
                + "4. Dogo argentino                  13. Bullmastiff\n"
                + "5. Dogo Guatemalteco               14. Bull terrier ingles\n"
                + "6. Fila brasileno                  15. Bulldog americano\n"
                + "7. Presa canario                   16. Rhodesiano\n"
                + "8. Doberman                        17. Rottweiler\n"
                + "9. Gran perro japones              18. Otro\n";

        System.out.println(s);
        razap = scan.nextInt();

        return razap;

    }

    /**
     * Método para indicar que el refugio ya no puede aceptar más perros
     */
    public void refugioLleno() {
        System.out.println("El refugio está a su máxima capacidad! No se aceptan más perritos :(");
    }

    /**
     * Método para indicar que la operación se ha realizado exitosamente
     */
    public void operacionExitosa() {
        System.out.println("\nSe han registrado los datos correctamente");
    }

    /**
     * Método para indicar que se desea agregar una nueva familia y se deben tomar
     * sus datos
     */
    public void nuevaFamilia() {
        System.out.println("\nPor favor ingrese los datos de la familia: ");
    }

    /**
     * @return String Método para ingresar el apellido familiar
     */
    public String apellidoFamilia() {
        System.out.println(
                "\nIngrese el apellido con el que se identificara a los miembros pertenecientes a esta familia: ");
        String apellidofam = scan.next();

        return apellidofam;
    }

    public void nuevoMiembro() {
        System.out.println(
                "\nIngrese todos los miembros de su familia: (todos los que viven en la misma casa, incluyendo usted)");
    }

    /**
     * @return int Método para ingresar nuevo miembro a la familia
     */
    public int agregarMiembro() {
        int op = 0;
        String s = "\nDesea agregar un miembro a la familia?: (si = 1, no = 2)";
        System.out.println(s);
        op = scan.nextInt();
        return op;
    }

    /**
     * @return String Método para ingresar el nombre del miembro de la familia
     */
    public String nombrePersona() {
        String nombrePersona = "";
        System.out.println("\nIngrese el nombre de la persona: ");
        nombrePersona = scan.next();
        return nombrePersona;

    }

    /**
     * @return int Método para ingresar la edad del miembro de la familia
     */
    public int edadPersona() {
        int edadPersona = 0;
        System.out.println("\nIngrese la edad de la persona: ");
        edadPersona = scan.nextInt();
        return edadPersona;

    }

    /**
     * Método para indicar que ya se encuentran familias registradas en el sistema
     */
    public void familiasllenas() {
        System.out.println("\nSe ha alcanzado el limite de familia! no pueden agregarse mas");

    }

    /**
     * @return int Método para ingresar la cantidad de perros que la familia desea
     *         adoptar
     */
    public int cantidadPerros() {
        int cantidad = 0;
        System.out.println("\nCuantos perros le gustaría refugiar?: ");
        cantidad = scan.nextInt();
        return cantidad;

    }

    /**
     * @param nombrep Método para indicar que se ha comenzado la busqueda de un
     *                hogar para el perro
     */
    public void refugiarPerro(String nombrep) {
        System.out.println("\nVamos a encontrar un hogar para " + nombrep);

    }

    /**
     * @param nombrep
     * @param af      Método para indicar que el perro ha encontrado un hogar
     */
    public void perritoRefugiado(String nombrep, String af) {
        System.out.println("\nEl perrito " + nombrep + " se ha ido con la familia " + af);

    }

    /**
     * @param nombrep Método para indicar que el perro no ha encontrado un hogar
     */
    public void huerfano(String nombrep) {
        System.out.println("\nNo encontramos un hogar para " + nombrep
                + " se quedara con nosotros hasta encontrarle un nuevo hogar.");

    }

    /**
     * Método para indicar que el refugio se encuentra sin perros
     */
    public void todos() {
        System.out.println("\nTodos los perritos han sido adoptados!");

    }

}
