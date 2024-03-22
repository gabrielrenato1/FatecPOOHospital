package classes;

import java.time.LocalDate;
import java.util.Objects;

public class Procedimento {

    private String data;
    private String descritivo;

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {

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

    public void consultar(){}

}
