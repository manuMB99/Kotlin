package example.myapp


interface Prestable {
    fun prestar()
}
abstract class ElementoMultimedia(val titulo: String, val anioPublicacion: Int)
class Libro(titulo: String, anioPublicacion: Int) : ElementoMultimedia(titulo, anioPublicacion), Prestable {

    override fun prestar() {
        println("📚 El libro '$titulo' ha sido registrado como prestado exitosamente.")
    }

    companion object {
        const val TIPO_RECURSO = "Libro"
    }
}

fun Libro.esAntiguo(): Boolean {
    return this.anioPublicacion < 1950
}

// --- PRUEBA DE IMPLEMENTACIÓN ---
fun main() {
    println("--- INICIANDO PRUEBAS DE LA BIBLIOTECA ---")

    // Instanciación (
    val miLibro = Libro("El Principito", 1943)
    val libroModerno = Libro("Clean Code", 2008)

    // Herencia y Abstracción
    println("\n[Prueba de Herencia]")
    println("Título del elemento: ${miLibro.titulo}")
    println("Año de publicación: ${miLibro.anioPublicacion}")

    // Prueba de Interfaz
    println("\n[Prueba de Interfaz]")
    miLibro.prestar()

    // Prueba de Función de Extensión
    println("\n[Prueba de Función de Extensión]")
    println("¿El libro '${miLibro.titulo}' es antiguo? -> ${miLibro.esAntiguo()}")
    println("¿El libro '${libroModerno.titulo}' es antiguo? -> ${libroModerno.esAntiguo()}")

    // Prueba del Companion Object
    println("\n[Prueba de Companion Object]")
    println("Constante estática (Libro.TIPO_RECURSO): ${Libro.TIPO_RECURSO}")
}