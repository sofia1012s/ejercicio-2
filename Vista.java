import java.util.Scanner;

public class Vista {
    private Scanner scan;

    public void bienvenida() {
        System.out.println(
                "\n***************************** Hogares temporales para canes ********************************************");
        System.out.println("Bienvenid@, muchas gracias por apoyar a estos perritos.");
    }

    public int menuOpciones() {
        int op;

        String s = "¿Qué desea hacer?\n" + "1. Ingresar nuevo perro\n" + "2. Ingresar nueva familia\n"
                + "3. Asignar perro a familia\n" + "4. Salir";

        System.out.println(s);
        op = scan.nextInt();

        return op;
    }

    public void despedida() {
        System.out.println("Gracias por usar el programa. Sigamos rescatando perros!");
    }

    public void opcionInvalida(){
		System.out.println("Ha elegido una opción inválida.");
	}

}
