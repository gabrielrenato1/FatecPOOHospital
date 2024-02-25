package classes;

public class Paciente {

    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public void cadastrar(){}

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Paciente:" +
            "\nNome: " + this.nome +
            "\nCPF: " + this.cpf +
            "\nTelefone: " + this.telefone +
            "\nGenero: " + this.genero +
            "\nIdade: " + this.idade
        );

        System.out.println("\n");

    }

}
