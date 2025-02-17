interface Vehiculo {

    var motorEncendido: Boolean
    val kmHora: Int

    fun acelerar(num: Int) {
        motorEncendido
    }

    fun frenar(num: Int) {}



}