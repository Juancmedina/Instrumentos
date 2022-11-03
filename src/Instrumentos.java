import java.util.Scanner;

public class Instrumentos {
    private String marca;
    private String color;
    private String tipo;

    public Instrumentos (String marca,String color,String tipo){
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }

    public Instrumentos (){
        marca="";
        color="";
        tipo="";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

public void datosInstrumentos(){
    Scanner datos = new Scanner(System.in);
    System.out.println("Ingrese la marca: ");
    marca = datos.next();
    System.out.println("Ingrese el color: ");
    color = datos.next();
    System.out.println("Ingrese el tipo: ");
    tipo = datos.next();
}

}
