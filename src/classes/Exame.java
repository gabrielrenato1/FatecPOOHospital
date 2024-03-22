package classes;

import java.time.LocalDate;
import java.util.Objects;

public class Exame extends Procedimento{

    public Exame(){}

    public Exame(Consulta consulta, String data, String descritivo) throws Exception {
        setData(data);
        setDescritivo(descritivo);
    }

    public void solicitar(){}

    public void mostrar(){

        System.out.printf("Exame:" +
            "\nData: " + getData() +
            "\nDescritivo: " + getDescritivo()
        );

        System.out.println("\n");

    }

}
