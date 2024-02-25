package classes;

public class Receita {

    public int consulta;
    public String data;
    public String descritivo;

    public void preescrever(){}

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Receita:" +
            "\nConsulta: " + this.consulta +
            "\nData: " + this.data +
            "\nDescritivo: " + this.descritivo
        );

        System.out.println("\n");

    }

}
