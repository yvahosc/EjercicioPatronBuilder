package co.com.MAKAIA.Forma1;

public class AutomovilBuilder implements Builder{

    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private int potencia;

    public AutomovilBuilder conMarca(String marca){
        this.marca = marca;
        return this;
    }

    public AutomovilBuilder conModelo(String modelo){
        this.modelo = modelo;
        return this;
    }

    public AutomovilBuilder conAnho(int anho){
        this.anho = anho;
        return this;
    }

    public AutomovilBuilder conColor(String color){
        this.color = color;
        return this;
    }

    public AutomovilBuilder conPotencia(int potencia){
        this.potencia = potencia;
        return this;
    }

    @Override
    public Automovil build() {
        return new Automovil(marca, modelo, anho, color, potencia);
    }
}
