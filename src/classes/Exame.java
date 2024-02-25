package classes;

public class Exame {

    public int consulta;
    public String data;
    public String descritivo;

    public void solicitar(){}

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Exame:" +
            "\nConsulta: " + this.consulta +
            "\nData: " + this.data +
            "\nDescritivo: " + this.descritivo
        );

        System.out.println("\n");

    }

}
