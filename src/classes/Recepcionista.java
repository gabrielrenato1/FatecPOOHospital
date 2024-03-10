package classes;

import java.util.Objects;

public class Recepcionista {

    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista(){}

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {

        if(Objects.equals(cpf, "")){

            this.cpf = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.cpf = cpf;

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

        System.out.printf("Recepcionista:" +
            "\nNome: " + getNome() +
            "\nCPF: " + getCpf() +
            "\nTelefone: " + getTelefone()
        );

        System.out.println("\n");

    }

}
