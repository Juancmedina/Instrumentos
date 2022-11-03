import java.util.Scanner;

public class Guitarras extends Instrumentos {
    byte numeroCuerdas;

    public Guitarras(String marca,String color,String tipo,byte numeroCuerdas){
        super(marca,color,tipo);
        this.numeroCuerdas=numeroCuerdas;
    }

    public Guitarras(){}

    @Override
    public void datosInstrumentos(){
        super.datosInstrumentos();
        Scanner datos= new Scanner(System.in);
        System.out.println("Ingrese el numero de cuerdas: ");
        numeroCuerdas= datos.nextByte();

    }



}