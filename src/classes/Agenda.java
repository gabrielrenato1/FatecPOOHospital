package classes;

public class Agenda {

    public String data;
    public String hora;
    public String medico;
    public String paciente;

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Agenda:" +
            "\nData: " + this.data +
            "\nHora: " + this.hora +
            "\nMédico: " + this.medico +
            "\nPaciente: " + this.paciente
        );

        System.out.println("\n");

    }

}
