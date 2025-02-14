class Coche : EncendidoApagado, Vehiculo {



    override fun encender() {
        println("Encendiendo el vehiculo")
    }

    override fun apagar() {
        println("Apagando el vehiculo")
    }

    override var kmHora: Double = 0.0

    override fun acelerar(num: Int) {
        kmHora += num
    }

    override fun frenar(num: Int) {
        kmHora -= num
    }

    override lateinit var motorEncendido: EncendidoApagado

    init {
        motorEncendido =
    }
}