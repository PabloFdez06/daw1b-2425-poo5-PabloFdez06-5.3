class Telefono : EncendidoApagado, DispositivoElectronico {

    override fun encender() {
        println("Encendiendo teléfono")
    }

    override fun apagar() {
        println("Apagando teléfono")
    }

    override fun reiniciar() {
        println("Teléfono reiniciado")
    }
}