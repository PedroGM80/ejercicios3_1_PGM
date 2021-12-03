
//Ejercicio 5.6
//Crear una clase Rectángulo, con atributos base y altura.
// La clase debe disponer del constructor y los métodos para calcular el área y el perímetro.
// Opcionalmente se puede crear el método toString para mostrar información sobre el rectángulo.
//En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.

class Cuadrado(val base: Int, val height: Int) {
    override fun toString(): String =
        "Base:${base} " + " Altura: ${height} Área: " + getArea() + " Perímetro " + getPerimeter()

    fun getArea(): Int {
        return this.base * this.height
    }

    fun getPerimeter(): Int {
        return (this.base + this.height) * 2
    }
}

public fun main() {
    val c1 = Cuadrado(2, 5)
    println(c1.toString())
    val c2 = Cuadrado(4, 5)
    println(c2.toString())
    val c3 = Cuadrado(5, 5)
    println(c3.toString())

}
