package classes;

import java.util.Objects;

public class Medico extends Funcionario {

    private String crm;
    private String especialidade;

    public Medico(){}

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        setCrm(crm);
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {

        if(Objects.equals(crm, "")){

            this.crm = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.crm = crm;

        }

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws Exception {

        if(Objects.equals(especialidade, "")){

            this.especialidade = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.especialidade = especialidade;

        }

    }

    public void mostrar(){

        System.out.printf("Médico:" +
            "\nNome: " + getNome() +
            "\nCRM: " + getCrm() +
            "\nTelefone: " + getTelefone() +
            "\nEspecialidade: " + getEspecialidade()
        );

        System.out.println("\n");

    }

    public void solicitarExame(Consulta consulta){

        try{

            Exame exame = new Exame(consulta,"2024-05-01" ,"Teste de joelho");
            consulta.getExame().add(exame);

        } catch (Exception err) {

            System.out.println(err.getMessage());

        }

    }

    public void preescreverReceita(Consulta consulta){

        try{

            Receita receita = new Receita(consulta, "2024-05-01", "Remédio de Joelho");
            consulta.getReceita().add(receita);

        } catch (Exception err) {

            System.out.println(err.getMessage());

        }

    }

}
