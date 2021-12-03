//Ejercicio 5.8
//Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres
//atributos, sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0). Crear el
//método toString para mostrar el tiempo en formato: XXh XXm XXs
//En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir los
//segundos o los minutos (y segundos, claro) e instancie la clase Tiempo mostrando su valor.
class Tiempo(private var hora: Int, private var minuto: Int, private var segundo: Int) {
    constructor(valorHora: Int, valorMinuto: Int) : this(valorHora, valorMinuto, 0)
    constructor(valorHora: Int) : this(valorHora, 0, 0)


    override fun toString(): String {
        return "Tiempo-> $hora:$minuto:$segundo"
    }
}

fun main() {
    var miHora1: Tiempo? =null

    var miHora: Int?
    var miMinuto: Int?
    var miSegundo: Int?


    println("Ingresa el valor para la hora")
    miHora = readLine()?.toIntOrNull()
    while (miHora == null) {
        println("El número ingresado no es válido")
        miHora = readLine()?.toIntOrNull()
    }


    println("Deme un valor para los minutos: ")
    miMinuto = readLine()?.toIntOrNull()
    println("Deme un valor para los minutos: ")
    miSegundo = readLine()?.toIntOrNull()


   if (miMinuto==null && miSegundo==null ){
           miHora1 = Tiempo(miHora)
   }
    if (miMinuto!=null && miSegundo==null ){
        miHora1 = Tiempo(miHora,miMinuto)
    }
    if (miMinuto!=null && miSegundo!=null ){
        miHora1 = Tiempo(miHora,miMinuto,miSegundo)
    }
    println(miHora1.toString())

}