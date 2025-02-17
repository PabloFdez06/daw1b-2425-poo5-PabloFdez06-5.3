class Lavadora : EncendidoApagado {

    override var estado: Boolean = true

    override fun encender() {
        estado = true
        println("Encendiendo lavadora")
    }

    override fun apagar() {
        estado = false
        println("Apagando lavadora")
    }

}