package acuario

abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"

    override fun comer() {
        println("cazar y comer peces")
    }
}

class PezPayaso(val color: String) : AccionPez {
    override fun comer() {
        println("comer algas")
    }
}
interface AccionPez {
    fun comer()
}

