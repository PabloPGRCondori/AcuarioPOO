package acuario

fun construirAcuario() {
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    val miTorre = Acuario.TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}

fun main() {
    construirAcuario()
}

