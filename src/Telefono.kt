class Telefono : EncendidoApagado, DispositivoElectronico {


    var estado: Boolean = true

    override fun encender() {
        estado = true
        println("Encendiendo teléfono")
    }

    override fun apagar() {
        estado = false
        println("Apagando teléfono")
    }

    override fun reiniciar() {
        if (estado){
            println("Teléfono reiniciado")
        }else {
            println("No puedes reiniciar el telefono apagado.")
        }
    }
}