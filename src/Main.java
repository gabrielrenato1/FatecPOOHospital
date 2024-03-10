import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        try{

            Medico medico = new Medico(
                    "Josias Jorge Oliveira", "CRM/SP 123456", "(11) 91234-5678",
                    "Fisioterapeuta", "SenhaForte"
            );

            medico.mostrar();

            Paciente paciente = new Paciente(
                    "Maria Andrade Souza", "123.456.789.00", "(11) 91234-5678"
                    ,"feminino" ,45
            );

            paciente.mostrar();

            Recepcionista recepcionista = new Recepcionista("Marcelo Vinicius Rocha", "009.876.543-21", "(11) 91234-5678", "SenhaGigante");

            recepcionista.mostrar();

            Agenda agenda = new Agenda("2024-04-12", "03:30", medico, paciente);

            agenda.mostrar();

            Consulta consulta = new Consulta(1552589, "2024-04-12", "15:30", medico, paciente, "Dor no Joelho", "Joelho triste");

            consulta.mostrar();

            Exame exame = new Exame(consulta.getProntuario(),"2024-05-01" ,"Teste de joelho");

            exame.mostrar();

            Receita receita = new Receita(consulta.getProntuario(), "2024-05-01", "Remédio de Joelho");
            receita.mostrar();

        }catch (Exception err){
            System.out.println(err.getMessage());
        }


    }

}