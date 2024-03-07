package classes;

public class Agenda {

    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public Agenda(){}

    public Agenda(String data, String hora, String medico, String paciente) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Agenda:" +
            "\nData: " + getData() +
            "\nHora: " + getHora() +
            "\nMédico: " + getMedico() +
            "\nPaciente: " + getPaciente()
        );

        System.out.println("\n");

    }

}
