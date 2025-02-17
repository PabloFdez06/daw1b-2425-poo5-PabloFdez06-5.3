class Telefono : EncendidoApagado, DispositivoElectronico {


    override var estado: Boolean = true

    override fun encender() {
        estado = true
        println("Encendiendo teléfono")
    }

    override fun apagar() {
        estado = false
        println("Apagando teléfono")
    }

    override fun reiniciar() {
        println("Teléfono reiniciado")
    }
}