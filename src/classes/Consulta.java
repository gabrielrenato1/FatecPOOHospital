package classes;

public class Consulta {

    private int prontuario;
    private String data;
    private String hora;
    private String medico;
    private String paciente;
    private String motivo;
    private String historico;

    public Consulta(){}

    public Consulta(int prontuario, String data, String hora, String medico, String paciente, String motivo, String historico) {
        setProntuario(prontuario);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void marcar(){}

    public void cancelar(){}

    public void consultar(){}

    public void realizar(){}

    public void atualizar(){}

    public void mostrar(){

        System.out.printf("Consulta:" +
            "\nProntuário: " + getProntuario() +
            "\nData: " + getData() +
            "\nHora: " + getHora() +
            "\nMédico: " + getMedico() +
            "\nPaciente: " + getPaciente() +
            "\nMotivo: " + getMotivo() +
            "\nHistórico: " + getHistorico()
        );

        System.out.println("\n");

    }

}
