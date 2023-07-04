# Ejercicio patrón Builder
## Desarrollo ejercicio de patrón de diseño builder dentro del desarrollo del BootCamp de desarrollo web BackEnd de MAKAIA.

### Repositorio respuesta al taller planteado:

#### Se te solicita implementar un patrón de creación Builder en Java para construir objetos de la clase "Automovil". La clase "Automovil" representa un automóvil y tiene los siguientes atributos:
* marca (String)
* modelo (String)
* año (int)
* color (String)
* potencia (int)

#### Debes implementar una clase Builder dentro de la clase "Automovil" que permita construir objetos paso a paso. El Builder debe tener los siguientes métodos:
* setMarca(String marca): establece la marca del automóvil y retorna el Builder actual.
* setModelo(String modelo): establece el modelo del automóvil y retorna el Builder actual.
* setAño(int año): establece el año de fabricación del automóvil y retorna el Builder actual.
* setColor(String color): establece el color del automóvil y retorna el Builder actual.
* setPotencia(int potencia): establece la potencia del automóvil en caballos de fuerza y retorna el Builder actual.
* build(): construye y retorna un objeto de tipo "Automovil" con los atributos configurados.

#### Además, se requiere implementar una clase principal "Main" donde se ejemplifique el uso del patrón Builder para crear un automóvil con los siguientes valores:
* marca: "Toyota"
* modelo: "Corolla"
* año: 2022
* color: "Rojo"
* potencia: 150

#### Una vez creado el automóvil, se deben imprimir en la consola los valores de los atributos: marca, modelo, año, color y potencia.

#### Recuerda utilizar los setters y getters adecuados en la clase "Automovil" para acceder a los atributos y realizar las validaciones necesarias en los métodos del Builder para garantizar la consistencia de los datos.
