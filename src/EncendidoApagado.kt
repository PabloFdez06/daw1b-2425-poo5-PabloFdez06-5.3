interface EncendidoApagado {

    var estado: Boolean

    fun encender() {
        estado = true
    }


    fun apagar() {
        estado = false
    }
}