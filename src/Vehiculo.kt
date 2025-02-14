interface Vehiculo {

    val motorEncendido: EncendidoApagado
    val kmHora: Double

    fun acelerar(num: Int) {}

    fun frenar(num: Int) {}

}