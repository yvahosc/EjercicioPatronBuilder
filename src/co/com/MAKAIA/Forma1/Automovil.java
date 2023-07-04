package co.com.MAKAIA.Forma1;

public class Automovil {
    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private int potencia;

    public Automovil(String marca, String modelo, int anho, String color, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.color = color;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnho() {
        return anho;
    }

    public String getColor() {
        return color;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Automovil: " +
                "marca: " + marca + ", modelo: " + modelo +
                ", año: " + anho +
                ", color: " + color +
                ", potencia: " + potencia +
                '.';
    }
}
