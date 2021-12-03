//Ejercicio 5.7
//Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
//caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como los métodos estándar:
//¿setters, setters? y toString.
//En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y
//vuelve a mostrarlos por pantalla.
class Coche(
    private var color: String,
    private var marca: String,
    private var modelo: String,
    private var cv: Int,
    private var numPuertas: Int,
    private var matricula: String
) {
    override fun toString(): String {
        return "Marca: $marca modelo: $modelo caballos $cv color: $color Número de puertas: $numPuertas matricula $matricula"
    }

    fun setMatricula(aMatricula: String) {
        matricula = aMatricula;
    }

    fun setMarca(aMarca: String) {
        marca = aMarca
    }

    fun setColor(aColor: String) {
        color = aColor
    }

    fun setNumPuertas(aNumPuertas: Int) {
        numPuertas = aNumPuertas
    }

    fun setModelo(aModelo: String) {
        modelo = aModelo
    }

    fun setCv(aCv: Int) {
        cv = aCv
    }

    fun getMatricula(): String {
        return matricula;
    }

    fun getMarca(): String {
        return marca
    }

    fun setColor(): String {
        return color
    }

    fun getNumPuertas(): Int {
        return numPuertas
    }

    fun getModelo(): String {
        return modelo
    }

    fun getCv(): Int {
        return cv
    }


}
fun main() {
    val car1 = Coche("Rojo","Ford","K",65,3,"MA4350CL")
    val car2 = Coche("Azul","Ford","Sierra",120,5,"CA4350CL")
    val car3 = Coche("Verde","Ford","Mondeo",120,5,"SE4350CR")
    println("Coche: $car1")
    println("Coche: $car2")
    println("Coche: $car3")
    car1.setColor("Amarillo")
    car2.setColor("Negro")
    car3.setColor("Blanco")
    println("Coche: $car1")
    println("Coche: $car2")
    println("Coche: $car3")

}