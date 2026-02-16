package edu.example.registro_

fun main() {

    val nombre: String = "Alex"
    var edad: Int = 17
    val email: String? = null
    val esSuscriptor: Boolean = true

    println("--- Procesando datos de: $nombre ---")

    if (esMayorDeEdad(edad)) {
        println("Estado: Acceso permitido")
    } else {
        println("Estado: Acceso denegado")
    }

    val textoEmail = email ?: "Email no registrado"
    println("Contacto: $textoEmail")


    val etapaVida = when (edad) {
        in 0..12 -> "Niño"
        in 13..17 -> "Adolescente"
        in 18..64 -> "Adulto"
        else -> "Adulto mayor"
    }
    println("Etapa detectada: $etapaVida")

    println("\n--- 5. Lista de Usuarios (MutableList y For) ---")

    val listaUsuarios: MutableList<String> = mutableListOf("Maria", "Juan", "Sofia")

    listaUsuarios.add(nombre)

    for (usuario in listaUsuarios) {
        println("Usuario en base de datos: $usuario")
    }
}

fun esMayorDeEdad(edad: Int): Boolean {
    return edad >= 18
}