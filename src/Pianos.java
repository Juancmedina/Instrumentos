import java.util.Scanner;

public class Pianos extends Instrumentos {
    byte numeroTeclas;

    public Pianos(String marca,String color,String tipo,byte numeroTeclas){
        super(marca,color,tipo);
        this.numeroTeclas=numeroTeclas;
    }

    public Pianos(){}

    @Override
    public void datosInstrumentos(){
        super.datosInstrumentos();
        Scanner datos= new Scanner(System.in);
        System.out.println("Ingrese el numero de cuerdas: ");
        numeroTeclas= datos.nextByte();

    }



}