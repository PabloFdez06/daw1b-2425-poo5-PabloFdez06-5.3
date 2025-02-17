class Coche : EncendidoApagado, Vehiculo {

    override var motorEncendido = false

    override fun encender() {
        motorEncendido = true
        println("Encendiendo el vehiculo")
    }

    override fun apagar() {
        motorEncendido = false
        println("Apagando el vehiculo")
    }
    

    override var kmHora: Int = 0

    override fun acelerar(num: Int) {
        if (motorEncendido) {
            kmHora += num
            println("Velocidad actualizada: $kmHora")
        } else{
            println("El motor debe estár encendido para acelerar")
        }
    }

    override fun frenar(num: Int) {
        if (motorEncendido) {
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