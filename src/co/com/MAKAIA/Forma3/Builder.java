package co.com.MAKAIA.Forma3;

public interface Builder {
    AutomovilBuilder conMarca(String marca);
    AutomovilBuilder conModelo(String modelo);
    AutomovilBuilder conAnho(int anho);
    AutomovilBuilder conColor(String color);
    AutomovilBuilder conPotencia(int potencia);
    Automovil build();
}
