package classes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Receita extends Procedimento{

    public Receita(){}

    public Receita(Consulta consulta, String data, String descritivo) throws Exception {
        setData(data);
        setDescritivo(descritivo);
    }

    public void preescrever(){}

    public void mostrar(){

        System.out.printf("Receita:" +
            "\nData: " + getData() +
            "\nDescritivo: " + getDescritivo()
        );

        System.out.println("\n");

    }

}
