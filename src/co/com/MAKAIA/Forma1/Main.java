package co.com.MAKAIA.Forma1;

public class Main {

    public static void main(String[] args) {
        Automovil automovil =
                new AutomovilBuilder().conMarca("Toyota").conModelo("Corolla")
                        .conAnho(2022).conColor("rojo").conPotencia(150).build();

        System.out.println(automovil.toString());
    }
}
