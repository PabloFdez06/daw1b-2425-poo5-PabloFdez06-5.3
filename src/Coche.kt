class Coche() : EncendidoApagado, Vehiculo {

    override var estado: Boolean = false

    override fun encender() {
        estado = true
        println("Encendiendo el vehiculo")
    }

    override fun apagar() {
        println("Apagando el vehiculo")
    }

    override var motorEncendido: EncendidoApagado
        get() = TODO("Not yet implemented")
        set(value) {}

    override var kmHora: Int = 0

    override fun acelerar(num: Int) {
        if (estado) {
            kmHora += num
            println("Velocidad actualizada: $kmHora")
        } else{
            println("El motor debe estár encendido para acelerar")
        }
    }

    override fun frenar(num: Int) {
        if (estado) {
            kmHora -= num
            if (kmHora < 0) {
                kmHora = 0
                println("Velocidad actualizada: $kmHora")

            } else {
                println("Velocidad actualizada: $kmHora")

            }
        } else{
            println("El motor debe estár encendido para acelerar")
        }
    }


}