import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Medico medico = new Medico();

        medico.nome = "Josias Jorge Oliveira";
        medico.crm = "CRM/SP 123456";
        medico.telefone = "(11) 91234-5678";
        medico.especialidade = "Fisioterapeuta";
        medico.senha = "SenhaForte";

        medico.mostrar();

        Paciente paciente = new Paciente();

        paciente.nome = "Maria Andrade Souza";
        paciente.cpf = "123.456.789.00";
        paciente.telefone = "(11) 91234-5678";
        paciente.genero = "Feminino";
        paciente.idade = 45;

        paciente.mostrar();

        Recepcionista recepcionista = new Recepcionista();

        recepcionista.nome = "Marcelo Vinicius Rocha";
        recepcionista.cpf = "009.876.543-21";
        recepcionista.telefone = "(11) 91234-5678";
        recepcionista.senha = "SenhaGigante";

        recepcionista.mostrar();

        Agenda agenda = new Agenda();

        agenda.data = "2024-04-12";
        agenda.hora = "15:30";
        agenda.medico = medico.nome + "/" + medico.crm;
        agenda.paciente = paciente.nome + "/" + paciente.cpf;

        agenda.mostrar();

        Consulta consulta = new Consulta();

        consulta.prontuario = 1552589;
        consulta.data = "2024-04-12";
        consulta.hora = "15:30";
        consulta.medico = medico.nome + "/" + medico.crm;
        consulta.paciente = paciente.nome + "/" + paciente.cpf;
        consulta.motivo = "Dor no Joelho";
        consulta.historico = "Joelho triste";

        consulta.mostrar();

        Exame exame = new Exame();

        exame.consulta = consulta.prontuario;
        exame.data = "2024-05-01";
        exame.descritivo = "Teste de joelho";

        exame.mostrar();

        Receita receita = new Receita();

        receita.consulta = consulta.prontuario;
        receita.data = "2024-05-01";
        receita.descritivo = "Remédio de Joelho";

        receita.mostrar();

    }

}