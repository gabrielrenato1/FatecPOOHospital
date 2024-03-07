package classes;

public class Exame {

    private int consulta;
    private String data;
    private String descritivo;

    public Exame(){}

    public Exame(int consulta, String data, String descritivo) {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public int getConsulta() {
        return consulta;
    }

    public void setConsulta(int consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void solicitar(){}

    public void consultar(){}

    public void mostrar(){

        System.out.printf("Exame:" +
            "\nConsulta: " + getConsulta() +
            "\nData: " + getData() +
            "\nDescritivo: " + getDescritivo()
        );

        System.out.println("\n");

    }

}
