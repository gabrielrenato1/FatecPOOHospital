package classes;

public class Medico {

    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public void acessar(){}

    public void mostrar(){

        System.out.printf("Médico:" +
            "\nNome: " + this.nome +
            "\nCRM: " + this.crm +
            "\nTelefone: " + this.telefone +
            "\nEspecialidade: " + this.especialidade
        );

        System.out.println("\n");

    }

}
