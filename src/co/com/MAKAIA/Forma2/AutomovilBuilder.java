package co.com.MAKAIA.Forma2;

public class AutomovilBuilder implements Builder{

    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private int potencia;
    private boolean aireAcondicionado;
    private boolean vidriosElectricos;
    private boolean camaraTrasera;

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

    public AutomovilBuilder conAire(){
        this.aireAcondicionado = true;
        return this;
    }

    public AutomovilBuilder conVidriosElectricos(){
        this.vidriosElectricos = true;
        return this;
    }

    public AutomovilBuilder conCamaraTrasera(){
        this.camaraTrasera = true;
        return this;
    }

    @Override
    public Automovil build() {
        return new Automovil(marca, modelo, anho, color, potencia,
                aireAcondicionado, vidriosElectricos, camaraTrasera);
    }
}
