package classes;

public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public Paciente(){}

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
