import java.util.Scanner;

public class Vista {
    private Scanner scan = new Scanner(System.in);

    public void bienvenida() {
        System.out.println(
                "\n***************************** Hogares temporales para canes *****************************");
        System.out.println("Bienvenid@, muchas gracias por apoyar a estos perritos.");
    }

    public int menuOpciones() {
        int op = 0;
        String s = "\nQue desea hacer?\n" + "1. Ingresar nuevo perro\n" + "2. Ingresar nueva familia\n"
                + "3. Asignar perro a familia\n" + "4. Salir";

        System.out.println(s);
        op = scan.nextInt();
        return op;
    }

    public void despedida() {
        System.out.println("\nGracias por usar el programa. Sigamos rescatando perros!");
    }

    public void opcionInvalida(){
		System.out.println("Ha elegido una opción inválida.");
	}

    public void nuevoPerro()
    {	
		System.out.println("\nPor favor ingrese los datos del perro: ");
    }

    public String nombrePerro()
    {
        String nombrep = "";
        System.out.println("\nNombre: ");
		nombrep = scan.next();

        return nombrep;
    }

    public String colorPerro(){
        String colorp = "";
        System.out.println("\nColor: ");
        colorp = scan.next();

        return colorp;
    }

    public String saludPerro()
    {
        String saludp = "";
        System.out.println("\nSalud (entre 0 a 10): ");
        saludp = scan.next();

        return saludp;
    }

    public String edadPerro()
    {
        String edadp = ""; 
        System.out.println("\nEdad: (no coloque espacios) ");
        edadp = scan.next();

        return edadp;
    }

    public String tamanoPerro()
    {
        String tamanop = "";
        System.out.println("\nTamano (pequeno, grande, mediano): ");
        tamanop = scan.next();

        return tamanop;
    }

    public int razaPerro()
    {
        int razap = 0;

        String s = 
        "\nRaza (coloque el numero de la raza correspondiente):\n" + 
        "1. Pit bull terrier                10. Mastin napolitano\n" + 
        "2. American Staffordshire terrier  11. Presa Mallorqui\n" + 
        "3. Tosa Inu                        12. Dogo de burdeos\n" + 
        "4. Dogo argentino                  13. Bullmastiff\n" +
        "5. Dogo Guatemalteco               14. Bull terrier ingles\n" +
        "6. Fila brasileno                  15. Bulldog americano\n" +
        "7. Presa canario                   16. Rhodesiano\n" +
        "8. Doberman                        17. Rottweiler\n" +
        "9. Gran perro japones              18. Otro\n";
        
        System.out.println(s);
        razap = scan.nextInt();

        return razap;

    }

    public void refugioLleno(){
        System.out.println("El refugio está a su máxima capacidad! No se aceptan más perritos :(");
    }

    public void operacionExitosa(){
        System.out.println("\nSe han registrado los datos correctamente");
    }

    public void nuevaFamilia(){
        System.out.println("\nPor favor ingrese los datos de la familia: ");
    }

    public String apellidoFamilia()
    {
        System.out.println("\nIngrese el apellido con el que se identificara a los miembros pertenecientes a esta familia: ");
        String apellidofam = scan.next();

        return apellidofam;
    }

    public void nuevoMiembro()
    {
        System.out.println("\nIngrese todos los miembros de su familia: (todos los que viven en la misma casa, incluyendo usted)");
    }

    public int agregarMiembro() {
        int op = 0;
        String s = "\nDesea agregar un miembro a la familia?: (si = 1, no = 2)";
        System.out.println(s);
        op = scan.nextInt();
        return op;
    }

    public String nombrePersona(){
        String nombrePersona = "";
        System.out.println("\nIngrese el nombre de la persona: ");
        nombrePersona = scan.next();
        return nombrePersona;

    }

    public String apellidoPersona(){
        String apellidoPersona = "";
        System.out.println("\nIngrese el apellido de la familia de la persona: (para poder agruparla con el resto de la familia)");
        apellidoPersona = scan.next();
        return apellidoPersona;

    }

    public int edadPersona(){
        int edadPersona = 0;
        System.out.println("\nIngrese la edad de la persona: ");
        edadPersona = scan.nextInt();
        return edadPersona;

    }

    public void familiasllenas(){
        System.out.println("\nSe ha alcanzado el limite de familia! no pueden agregarse mas");

    }
}
