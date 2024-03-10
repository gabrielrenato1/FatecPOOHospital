package classes;

import java.util.Objects;

public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public Paciente(){}

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) throws Exception{
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
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

    public void setCpf(String cpf) throws Exception{

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) throws Exception {

        if(Objects.equals(genero, "") || !(Objects.equals(genero, "masculino") || Objects.equals(genero, "feminino"))){

            this.genero = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.genero = genero;

        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {

        if(idade < 0){

            this.idade = 0;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.idade = idade;

        }

    }

    public void cadastrar(){}

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Paciente:" +
            "\nNome: " + getNome() +
            "\nCPF: " + getCpf() +
            "\nTelefone: " + getTelefone() +
            "\nGenero: " + getGenero() +
            "\nIdade: " + getIdade()
        );

        System.out.println("\n");

    }

}
