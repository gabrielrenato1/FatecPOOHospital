package classes;

public class Consulta {

    public int prontuario;
    public String data;
    public String hora;
    public String medico;
    public String paciente;
    public String motivo;
    public String historico;

    public void marcar(){}

    public void cancelar(){}

    public void consultar(){}

    public void realizar(){}

    public void atualizar(){}

    public void mostrar(){

        System.out.printf("Consulta:" +
            "\nProntuário: " + this.prontuario +
            "\nData: " + this.data +
            "\nHora: " + this.hora +
            "\nMédico: " + this.medico +
            "\nPaciente: " + this.paciente +
            "\nMotivo: " + this.motivo +
            "\nHistórico: " + this.historico
        );

        System.out.println("\n");

    }

}
