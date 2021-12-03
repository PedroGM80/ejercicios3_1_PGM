import kotlin.io.println as println1

class ConjuntoLibros(private var misLibros: Array<Libro?> = Array(4) { null }) {


    fun añadirLibro(aLibro: Libro) {
        var count = 0
        for ((index, value) in misLibros.withIndex()) {
            var test = misLibros[index]

            if (test == null) {
                misLibros[index] = aLibro
                break
            } else {
                count++
            }
        }
        if (count == 3) {
            println1("No se pueden añadir mas libros")
        }
    }

    fun getMisLibros(): Array<Libro?> {
        return misLibros
    }

    fun eliminarLibroBusquedaTitulo(aTitulo: String) {
        for ((index, value) in misLibros.withIndex()) {
            var test = misLibros[index]
            if (test != null) {
                if (test.getTitulo() == aTitulo) {
                    misLibros[index] = null
                    break
                }
            }
        }
    }

    fun eliminarLibroBusquedaAutor(aAutor: String) {
        for ((index, value) in misLibros.withIndex()) {
            var test = misLibros[index]
            if (test != null) {
                if (test.getAutor() == aAutor) {
                    misLibros[index] = null
                    break
                }
            }
        }
    }


}


fun main() {
    val l1 = Libro("Libro1", "autor uno", 40, 8)
    val l2 = Libro("Libro2", "autor dos", 50, 5)

    val c1 = ConjuntoLibros()
    c1.añadirLibro(l1)
    c1.añadirLibro(l2)

    for (item in c1.getMisLibros()) println1(item)

    c1.eliminarLibroBusquedaTitulo("Libro1")
    println1("Eliminando un Libro con titulo:libro1")
    for (item in c1.getMisLibros()) println1(item)
    c1.eliminarLibroBusquedaAutor("autor dos")
    println1("Eliminando un Libro con autor:autor2")
    for (item in c1.getMisLibros()) println1(item)
    c1.añadirLibro(l1)
    println1("Añado el libro l1 de nuevo")
    for (item in c1.getMisLibros()) println1(item)
    c1.añadirLibro(l1)
    c1.añadirLibro(l1)
    c1.añadirLibro(l1)
}