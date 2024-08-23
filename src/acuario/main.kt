package acuario

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso("naranja")

    println("Color del Tiburón: ${tiburon.color}")
    tiburon.comer()

    println("Color del Pez Payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {
    crearPeces()
}