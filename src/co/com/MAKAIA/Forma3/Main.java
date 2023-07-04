package co.com.MAKAIA.Forma3;

public class Main {

    public static void main(String[] args) {
        Automovil automovil1 =
                new AutomovilBuilder().conMarca("Toyota").conModelo("Corolla")
                        .conAnho(2022).conColor("rojo").conPotencia(150).build();

        System.out.println(automovil1.toString());

        Automovil automovil2 =
                new AutomovilBuilder().conMarca("Mazda").conModelo("CX-5")
                        .conAnho(2022).conColor("rojo").conPotencia(150)
                        .conAire().conVidriosElectricos().build();

        System.out.println(automovil2.toString());

        Automovil automovil3 =
                new AutomovilBuilder().conMarca("Ford").conModelo("Fiesta")
                        .conAnho(2022).conColor("blanco").conPotencia(150)
                        .conAire().conVidriosElectricos().conCamaraTrasera().build();

        System.out.println(automovil3.toString());

        Automovil automovil4 =
                new AutomovilBuilder().conMarca("Nissan").conModelo("March")
                        .conAnho(2022).conColor("blanco").conPotencia(150)
                        .lujoso().build();

        System.out.println(automovil4.toString());

        Automovil automovil5 =
                new AutomovilBuilder().conMarca("Chevrolet").conModelo("Sail")
                        .conAnho(2022).conColor("blanco").conPotencia(150)
                        .basico().build();

        System.out.println(automovil5.toString());
    }
}
