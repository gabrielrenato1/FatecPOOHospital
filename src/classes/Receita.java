package classes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Receita {

    private int consulta;
    private String data;
    private String descritivo;

    public Receita(){}

    public Receita(int consulta, String data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public int getConsulta() {
        return consulta;
    }

    public void setConsulta(int consulta) throws Exception {

        if(consulta < 0){

            this.consulta = 0;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.consulta = consulta;

        }

    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception{

        LocalDate dataReceita = LocalDate.parse(data);
        LocalDate dataAtual = LocalDate.now();

        if(dataReceita.isBefore(dataAtual) || Objects.equals(data, "")){

            this.data = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.data = data;

        }

    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{

        if(Objects.equals(descritivo, "")){

            this.descritivo = null;
            throw new Exception("Ocorreu uma exceção – Valores padrões definidos");

        }else{

            this.descritivo = descritivo;

        }

    }

    public void preescrever(){}

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Receita:" +
            "\nConsulta: " + getConsulta() +
            "\nData: " + getData() +
            "\nDescritivo: " + getDescritivo()
        );

        System.out.println("\n");

    }

}
