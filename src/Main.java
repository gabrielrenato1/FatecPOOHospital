import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        try{

            Recepcionista recepcionista = new Recepcionista("Marcelo Vinicius Rocha", "009.876.543-21", "(11) 91234-5678", "SenhaGigante");

            recepcionista.mostrar();

            Paciente paciente = recepcionista.cadastrarPaciente();

            paciente.mostrar();

            Medico medico = new Medico(
                    "Josias Jorge Oliveira", "CRM/SP 123456", "(11) 91234-5678",
                    "Fisioterapeuta", "SenhaForte"
            );

            medico.mostrar();

            Consulta consulta = recepcionista.marcarConsulta(paciente, medico);

            consulta.mostrar();

            Exame exame = medico.solicitarExame(consulta);

            exame.mostrar();

            Receita receita = medico.preescreverReceita(consulta);

            receita.mostrar();

        }catch (Exception err){
            System.out.println(err.getMessage());
        }


    }

}