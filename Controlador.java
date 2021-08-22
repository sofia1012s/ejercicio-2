public class Controlador {

    public static void main(String[] args) {
        Vista view = new Vista();
        Perro dog;
        Persona miembro = null;
        Perro[] perrosRefugio = new Perro[15];
        Familia[] familias = new Familia[20];

        view.bienvenida();
        int opcion = 0;
        
        while (opcion != 4) {
            opcion = view.menuOpciones();

            switch (opcion) {
                case 1:
                    view.nuevoPerro();
                    String nombrep = view.nombrePerro();
                    String colorp = view.colorPerro();
                    String saludp = view.saludPerro();
                    String edadp = view.edadPerro();
                    String tamanop = view.tamanoPerro();
                    int razap = view.razaPerro();
                    Boolean refugiadop = false;
                    dog = new Perro(nombrep, colorp, saludp, edadp, tamanop, razap, refugiadop);

                    for(int i = 0; i < perrosRefugio.length; i++){
                        if (perrosRefugio[i]==null){
                        perrosRefugio[i] = dog;}

                        if(i == perrosRefugio.length){
                            view.refugioLleno();
                        }
                    }
                    view.operacionExitosa();
                    break;

                case 2:
                view.nuevaFamilia();

                String apellidoFam = "";
                int np = 0;
                int ng = 0;
                int a = 0;
                int pr = 0;
                boolean d = true;
                Familia fam = new Familia(apellidoFam, np, ng, a, pr,d);
                apellidoFam = view.apellidoFamilia();

                view.nuevoMiembro();
                int op = 0;
                op = view.agregarMiembro();

                while(op!=2){
                    String nombre = view.nombrePersona();
                    String apellido = view.apellidoPersona();
                    int edad = view.edadPersona();
                    miembro = new Persona(nombre,apellido,edad);
                    fam.nuevoMiembro(miembro);
                    op = view.agregarMiembro();
                }

                np = fam.getPequenos();
                ng = fam.getGrande();
                a = fam.getAdultos();
                pr = fam.getPerros();
                d = fam.getDisponibilidad();
                
                for(int i = 0; i < familias.length; i++){

                    if(i == familias.length){
                        view.familiasllenas();
                    }

                    if (familias[i]==null){
                        familias[i] = fam;}
                }
                view.operacionExitosa();
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