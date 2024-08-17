package acuario

fun construirAcuario() {
    val acuario1 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario1.imprimirTamano()

    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    val miTorre = TanqueTorre(alto = 40, diametro = 25)
    miTorre.imprimirTamano()
}

fun main() {
    construirAcuario()
}