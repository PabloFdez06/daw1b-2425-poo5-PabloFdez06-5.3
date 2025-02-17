interface Vehiculo {

    var motorEncendido: EncendidoApagado
    val kmHora: Int

    fun acelerar(num: Int) {
        motorEncendido
    }

    fun frenar(num: Int) {}



}