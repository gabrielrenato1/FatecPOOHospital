package classes;

import java.util.Objects;

public class Recepcionista extends Funcionario{

    private String cpf;

    public Recepcionista(){}

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
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

    @Override
    public void mostrar(){

        System.out.printf("Recepcionista:" +
            "\nCPF: " + getCpf()
        );
        super.mostrar();

        System.out.println("\n");

    }

    public Paciente cadastrarPaciente() {

        Paciente paciente = null;

        try {

            paciente = new Paciente(
                    "Maria Andrade Souza", "123.456.789.00", "(11) 91234-5678",
                    "feminino", 45
            );

        } catch (Exception err) {

            System.out.println(err.getMessage());
            return null;

        }

        return paciente;

    }

    public Consulta marcarConsulta(Paciente paciente, Medico medico){

        Consulta consulta = null;

        try{

            consulta = new Consulta(1552589, "2024-04-12", "15:30", medico, paciente, "Dor no Joelho", "Joelho triste");

        } catch (Exception err) {

            System.out.println(err.getMessage());

        }

        return consulta;

    }

}
