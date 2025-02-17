fun main() {
    val vehiculo1 = Coche()
    val telefono1 = Telefono()
    val electrodomestico1 = Lavadora()

    println("VEHICULO")

    vehiculo1.encender()
    vehiculo1.frenar(5)
    vehiculo1.acelerar(115)
    vehiculo1.frenar(115)
    vehiculo1. apagar()

    println("--------------O--------------")

    println("TELÉFONO")

    telefono1.encender()
    telefono1.apagar()
    telefono1.encender()
    telefono1.reiniciar()

    println("--------------O--------------")

    println("ELECTRODOMÉSTICO")

    electrodomestico1.apagar()
    electrodomestico1.encender()
}