package co.com.MAKAIA.Forma2;

public class Automovil {
    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private int potencia;
    private boolean aireAcondicionado;
    private boolean vidriosElectricos;
    private boolean camaraTrasera;

    public Automovil(String marca, String modelo, int anho, String color,
                     int potencia, boolean aireAcondicionado,
                     boolean vidriosElectricos, boolean camaraTrasera)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.color = color;
        this.potencia = potencia;
        this.aireAcondicionado = aireAcondicionado;
        this.vidriosElectricos = vidriosElectricos;
        this.camaraTrasera = camaraTrasera;
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

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isVidriosElectricos() {
        return vidriosElectricos;
    }

    public boolean isCamaraTrasera() {
        return camaraTrasera;
    }

    @Override
    public String toString() {
        return "Automovil: " +
                "marca: " + marca + ", modelo: " + modelo +", año: " + anho +
                ", color: " + color +", potencia: " + potencia + ", aire " +
                "acondicionado: " + aireAcondicionado + ", vidrios " +
                "eléctricos: " + vidriosElectricos + ", cámara trasera: " +
                camaraTrasera + ".";
    }
}
