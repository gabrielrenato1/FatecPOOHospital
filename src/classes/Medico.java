package classes;

import java.util.Objects;

public class Medico {

    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico(){}

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {

        if(Objects.equals(nome, "")){

            this.nome = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.nome = nome;

        }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {

        if(Objects.equals(telefone, "")){

            this.telefone = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.telefone = telefone;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {

        if(Objects.equals(senha, "")){

            this.senha = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.senha = senha;

        }

    }

    public void acessar(){}

    public void mostrar(){

        System.out.printf("Médico:" +
            "\nNome: " + getNome() +
            "\nCRM: " + getCrm() +
            "\nTelefone: " + getTelefone() +
            "\nEspecialidade: " + getEspecialidade()
        );

        System.out.println("\n");

    }

}
