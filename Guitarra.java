public class Guitarra {
    private String marca;
    private String modelo;
    private int numeroDeCordas;
    private String tipo;

    public Guitarra(String marca, String modelo, int numeroDeCordas, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeCordas = numeroDeCordas;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de Cordas: " + numeroDeCordas);
        System.out.println("Tipo: " + tipo);
    }

    public static void main(String[] args) {
        Guitarra minhaGuitarra = new Guitarra("Fender", "Stratocaster", 6, "Elétrica");
        minhaGuitarra.exibirInformacoes();

        minhaGuitarra.setMarca("Gibson");
        minhaGuitarra.setModelo("Les Paul");
        minhaGuitarra.setNumeroDeCordas(7);
        minhaGuitarra.setTipo("Elétrica");

        minhaGuitarra.exibirInformacoes();
    }
}

