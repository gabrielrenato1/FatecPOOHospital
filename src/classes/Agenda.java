package classes;

import java.time.LocalDate;
import java.util.Objects;

public class Agenda {

    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda(){}

    public Agenda(String data, String hora, Medico medico, Paciente paciente) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {

        LocalDate dataAgenda = LocalDate.parse(data);
        LocalDate dataAtual = LocalDate.now();

        if(dataAgenda.isBefore(dataAtual) || Objects.equals(data, "")){

            this.data = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.data = data;

        }

    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws Exception {

        if(Objects.equals(hora, "")){

            this.hora = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.hora = hora;

        }

    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) throws Exception {

        if(medico == null){

            this.medico = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.medico = medico;

        }

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) throws Exception {

        if(paciente == null){

            this.paciente = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.paciente = paciente;

        }

    }

    public void consultar(){}

    public void mostrar(){

        System.out.printf(
            "\nData: " + getData() +
            "\nHora: " + getHora() +
            "\nMédico: " + getMedico().getNome() + " | " + getMedico().getCrm() +
            "\nPaciente: " + getPaciente().getNome() + " | " + getPaciente().getCpf()
        );

    }

}
