public class Controlador {

    public static void main(String[] args) {
        Vista view = new Vista();

        view.bienvenida();
        int opcion = 0;

        while (opcion != 4) {
            opcion = view.menuOpciones();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    view.despedida();
                    break;
                default:
                    view.opcionInvalida();
                    break;
            }
        }
    }
}

/*
 * for (int i = 0; i <= 4;) { if (perros[i] == null) { perros[i] = perro; }
 * 
 * else { disponibilidad = false; } } for (int i = 0; i <= (miembros.length);)
 * if (miembros[i] != null) { if (miembros[i].getEdad() < 10) { ninosPequenos++;
 * } else if (miembros[i].getEdad() > 10 && miembros[i].getEdad() < 18) {
 * ninosGrades++; } else if (miembros[i].getEdad() >= 18) { adultos++; } }
 */
