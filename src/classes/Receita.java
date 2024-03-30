package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Receita extends Procedimento{

    public Receita(){}

    public Receita(Consulta consulta, String data, String descritivo) throws Exception {
        setData(data);
        setDescritivo(descritivo);
    }

    @Override
    public String getData() {
        LocalDate dataAgenda = LocalDate.parse(super.getData());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataAgenda.format(formatter);
    }

    public void preescrever(){}

    public void mostrar(){

        System.out.print("Receita:");
        super.mostrar();

        System.out.println("\n");

    }

}
