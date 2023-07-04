package co.com.MAKAIA.Forma3;

public class AutomovilBuilder implements Builder {

    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private int potencia;
    private boolean aireAcondicionado;
    private boolean vidriosElectricos;
    private boolean camaraTrasera;

    @Override
    public AutomovilBuilder conMarca(String marca){
        this.marca = marca;
        return this;
    }

    @Override
    public AutomovilBuilder conModelo(String modelo){
        this.modelo = modelo;
        return this;
    }

    @Override
    public AutomovilBuilder conAnho(int anho){
        this.anho = anho;
        return this;
    }

    @Override
    public AutomovilBuilder conColor(String color){
        this.color = color;
        return this;
    }

    @Override
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

    public AutomovilBuilder lujoso(){
        this.aireAcondicionado = true;
        this.vidriosElectricos = true;
        this.camaraTrasera = true;
        return this;
    }

    public AutomovilBuilder basico(){
        this.aireAcondicionado = false;
        this.vidriosElectricos = false;
        this.camaraTrasera = false;
        return this;
    }

    @Override
    public Automovil build() {
        return new Automovil(marca, modelo, anho, color, potencia,
                aireAcondicionado, vidriosElectricos, camaraTrasera);
    }
}
