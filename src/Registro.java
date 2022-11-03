import java.util.Scanner;

public class Registro {
    public static void main(String[]args){

        Scanner sn = new Scanner(System.in);
        boolean salir  = false;
        int opcion;
        int cantidad=0;

        while (!salir){
            System.out.println("Registro De Instrumentos");
            System.out.println("************************");
            System.out.println("Ingrese la cantidad de instrumentos a registrar");
            cantidad =sn.nextInt();
            System.out.println("************************");
            System.out.println("1 - Registrar Guitarra");
            System.out.println("2 - Registrar Piano");
            System.out.println("************************");
            System.out.println("Seleccione una Opcion");
            opcion = sn.nextInt();

            switch (opcion){
                case 1:
                    Guitarras [] guitarras = new Guitarras[cantidad];
                    for (int i = 0; i<guitarras.length;i++){
                        guitarras[i] = new Guitarras();
                        guitarras[i].datosInstrumentos();
                        System.out.println("Marca: " +guitarras[i].getMarca() +
                                "\nColor: " +guitarras[i].getColor() +
                                "\nTipo: " +guitarras[i].getTipo() +
                                "\nNumero de Cuerdas: " +guitarras[i].numeroCuerdas);
                    }
                    break;

                case 2:
                    Pianos [] pianos = new Pianos[cantidad];
                    for (int i = 0; i<pianos.length;i++){
                        pianos[i] = new Pianos();
                        pianos[i].datosInstrumentos();
                        System.out.println("Marca: " +pianos[i].getMarca() +
                                "\nColor: " +pianos[i].getColor() +
                                "\nTipo: " +pianos[i].getTipo() +
                                "\nNumero de Teclas: " +pianos[i].numeroTeclas);
                    }
                    break;

                case 3:
                    salir=true;
                    break;
            }
        }

    }
}
