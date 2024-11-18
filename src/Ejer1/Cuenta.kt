package Ejer1

class Cuenta(var titular: String, var cantidad: Double = 0.0) {
    fun ingresar(cantidad: Double) {
        if (cantidad > 0) {
            this.cantidad += cantidad
        }
    }

    fun retirar(cantidad: Double) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0.0
        } else {
            this.cantidad -= cantidad
        }
    }

    override fun toString(): String {
        return "Titular: $titular, Cantidad: $cantidad"
    }
}