package classes;

public class Recepcionista {

    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public void acessar(){}

    public void mostrar(){

        System.out.printf("Recepcionista:" +
            "\nNome: " + this.nome +
            "\nCPF: " + this.cpf +
            "\nTelefone: " + this.telefone
        );

        System.out.println("\n");

    }

}
