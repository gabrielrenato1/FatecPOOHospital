package classes;

import java.lang.module.ModuleDescriptor;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Consulta extends Agenda{

    private int prontuario;
    private Agenda agenda;
    private String motivo;
    private String historico;
    private List<Receita> receita = new ArrayList<Receita>();
    private List<Exame> exame = new ArrayList<Exame>();

    public Consulta(){}

    public Consulta(int prontuario, String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception {
        setProntuario(prontuario);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    @Override
    public String getData() {
        LocalDate dataAgenda = LocalDate.parse(super.getData());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataAgenda.format(formatter);
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public List<Receita> getReceita() {
        return receita;
    }

    public void setReceita(List<Receita> receita) {
        this.receita = receita;
    }

    public List<Exame> getExame() {
        return exame;
    }

    public void setExame(List<Exame> exame) {
        this.exame = exame;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) throws Exception {

        if(prontuario < 0){

            this.prontuario = 0;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.prontuario = prontuario;

        }

    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws Exception {

        if(Objects.equals(motivo, "")){

            this.motivo = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.motivo = motivo;

        }

    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) throws Exception {

        if(Objects.equals(historico, "")){

            this.historico = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.historico = historico;

        }

    }

    public void marcar(){}

    public void cancelar(){}

    public void consultar(){}

    public void realizar(){}

    public void atualizar(){}

    @Override
    public void mostrar(){

        System.out.printf("Consulta:" +
            "\nMotivo: " + getMotivo() +
            "\nHistórico: " + getHistorico()
        );
        super.mostrar();

        System.out.println("\n");

        for(Exame ex: getExame()){
            ex.mostrar();
        }

        for(Receita re: getReceita()){
            re.mostrar();
        }

        System.out.println("\n");

    }

}
