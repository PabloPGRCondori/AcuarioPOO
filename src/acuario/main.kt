package acuario

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El color del tiburon es: ${tiburon.color}")
    println("El color del Pez Payaso es: ${pezPayaso.color}")
}

fun main() {
    crearPeces()
}