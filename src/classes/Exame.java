package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Exame extends Procedimento{

    public Exame(){}

    public Exame(Consulta consulta, String data, String descritivo) throws Exception {
        setData(data);
        setDescritivo(descritivo);
    }

    @Override
    public String getData() {
        LocalDate dataAgenda = LocalDate.parse(super.getData());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataAgenda.format(formatter);
    }

    public void solicitar(){}

    public void mostrar(){

        System.out.print("Exame:");
        super.mostrar();

        System.out.println("\n");

    }

}
