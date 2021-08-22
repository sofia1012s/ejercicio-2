
public class Controlador {

    public static void main(String[] args) {
        Vista view = new Vista();
        Perro dog;
        Persona miembro = null;
        Perro[] perrosRefugio = new Perro[25];
        Familia[] familias = new Familia[15];

        // Familias pre-agregadas

        // Familia Lopez
        Familia fam1 = new Familia("Lopez", 1, 1, 2, 0, true, 4);
        Persona miembro1 = new Persona("Lucas", 8);
        fam1.nuevoMiembro(miembro1);
        Persona miembro2 = new Persona("Pablo", 15);
        fam1.nuevoMiembro(miembro2);
        Persona miembro3 = new Persona("Rosa", 40);
        fam1.nuevoMiembro(miembro3);
        Persona miembro4 = new Persona("Jose", 40);
        fam1.nuevoMiembro(miembro4);
        familias[0] = fam1;

        // Familia Perez
        Familia fam2 = new Familia("Perez", 1, 1, 2, 0, true, 1);
        Persona miembro5 = new Persona("Leo", 6);
        fam2.nuevoMiembro(miembro5);
        Persona miembro6 = new Persona("Karen", 18);
        fam2.nuevoMiembro(miembro6);
        Persona miembro7 = new Persona("Marta", 43);
        fam2.nuevoMiembro(miembro7);
        Persona miembro8 = new Persona("Pedro", 45);
        fam2.nuevoMiembro(miembro8);
        familias[1] = fam2;

        // Familia Rodriguez
        Familia fam3 = new Familia("Rodriguez", 0, 0, 4, 0, true, 3);
        Persona miembro9 = new Persona("Sam", 19);
        fam3.nuevoMiembro(miembro9);
        Persona miembro10 = new Persona("Casey", 20);
        fam3.nuevoMiembro(miembro10);
        Persona miembro11 = new Persona("John", 43);
        fam3.nuevoMiembro(miembro11);
        Persona miembro12 = new Persona("Sandra", 45);
        fam3.nuevoMiembro(miembro12);
        familias[2] = fam3;

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
                    int tamanop = view.tamanoPerro();
                    int razap = view.razaPerro();
                    Boolean refugiadop = false;
                    dog = new Perro(nombrep, colorp, saludp, edadp, tamanop, razap, refugiadop);

                    for (int i = 0; i < perrosRefugio.length; i++) {
                        if (perrosRefugio[i] == null) {
                            perrosRefugio[i] = dog;
                        }

                        if (i == perrosRefugio.length) {
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
                    int cp = 1;

                    Familia fam = new Familia(apellidoFam, np, ng, a, pr, d, cp);
                    apellidoFam = view.apellidoFamilia();
                    cp = view.cantidadPerros();
                    view.nuevoMiembro();
                    int op = 0;
                    op = view.agregarMiembro();

                    while (op != 2) {
                        String nombre = view.nombrePersona();
                        int edad = view.edadPersona();
                        miembro = new Persona(nombre, edad);
                        fam.nuevoMiembro(miembro);
                        op = view.agregarMiembro();
                    }

                    np = fam.getPequenos();
                    ng = fam.getGrande();
                    a = fam.getAdultos();
                    pr = fam.getPerros();
                    d = fam.getDisponibilidad();

                    for (int i = 0; i < familias.length; i++) {

                        if (i == familias.length) {
                            view.familiasllenas();
                        }

                        if (familias[i] == null) {
                            familias[i] = fam;
                        }
                    }
                    view.operacionExitosa();
                    break;

                case 3: {
                    for (int i = 0; i < familias.length;) {

                        // si la familia se encuentra disponible
                        if (familias[i].getDisponibilidad() == true) {

                            for (int j = 0; j < perrosRefugio.length;) {
                                if (perrosRefugio[j] != null) {
                                    
                                    if (perrosRefugio[j].getEstado() == false) {
                                        String nombre = perrosRefugio[j].getNombre();
                                        view.refugiarPerro(nombre);

                                        // si el perro no es de raza peligrosa
                                        if (perrosRefugio[j].getRaza() == 18) {

                                            // si la familia tiene niños pequeños
                                            if (familias[j].getPequenos() > 0) {
                                                // solamente pueden tomar al perro si es de raza pequeña
                                                if (perrosRefugio[j].getTamano() == 1) {
                                                    Perro perrito = perrosRefugio[j];
                                                    familias[i].nuevoPerro(perrito);
                                                    perrosRefugio[j].setEstado();
                                                    view.operacionExitosa();
                                                    String n = perrosRefugio[j].getNombre();
                                                    String af = familias[i].getApellido();

                                                    view.perritoRefugiado(n, af);
                                                    break;
                                                }
                                            }
                                            // si la familia tiene niños solamente grandes
                                            if (familias[j].getGrande() > 0 && familias[j].getPequenos() == 0) {
                                                // solamente pueden tomar al perro si es de raza pequeña o mediana
                                                if (perrosRefugio[j].getTamano() != 3) {
                                                    Perro perrito = perrosRefugio[j];
                                                    familias[i].nuevoPerro(perrito);
                                                    perrosRefugio[j].setEstado();
                                                    view.operacionExitosa();
                                                    String n = perrosRefugio[j].getNombre();
                                                    String af = familias[i].getApellido();

                                                    view.perritoRefugiado(n, af);
                                                    break;
                                                }
                                            }

                                            // si la familia tiene niños solamente adultos
                                            if (familias[j].getGrande() == 0 && familias[j].getPequenos() == 0 && familias[j].getAdultos() > 0) {

                                                Perro perrito = perrosRefugio[j];
                                                familias[i].nuevoPerro(perrito);
                                                perrosRefugio[j].setEstado();
                                                view.operacionExitosa();
                                                String n = perrosRefugio[j].getNombre();
                                                String af = familias[i].getApellido();

                                                view.perritoRefugiado(n, af);
                                                break;
                                            }
                                        }

                                        // si el perro es de raza peligrosa
                                        if (perrosRefugio[j].getRaza() != 18) {
                                            if (familias[j].getPequenos() == 0 || familias[j].getGrande() == 0) {
                                                Perro perrito = perrosRefugio[j];
                                                familias[i].nuevoPerro(perrito);
                                                perrosRefugio[j].setEstado();
                                                view.operacionExitosa();
                                                String n = perrosRefugio[j].getNombre();
                                                String af = familias[i].getApellido();

                                                view.perritoRefugiado(n, af);
                                                break;
                                            }
                                        }
                                        
                                        else{
                                            view.huerfano(nombre);
                                        }
                                       
                                        break;
                                    }
                    
                                    else{
                                        view.todos();
                                        break;
                                    }
                                } 
                                
                                else {
                                    view.todos();
                                    break;
                                }
                            }

                        }
                        break;
                    }
                    break;
                }
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