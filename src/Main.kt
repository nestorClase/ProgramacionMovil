package Ejer2


fun main() {
    val almacen = Almacen()
    val operaciones = Operaciones(almacen.bebidas)
    val bebida = Bebidas()
    val bebida2 = Bebidas()
    val bebida3 = Bebidas()
    bebida.crearBebidadatos(1, 2, 3.0, "Coca Cola", 2)
    bebida2.crearBebidadatos(2, 2, 3.0, "Coca Cola", 2)
    bebida3.crearBebidadatos(3, 2, 3.0, "Fontbella", 1)
    almacen.añadirBebida(bebida)
    almacen.añadirBebida(bebida2)
    almacen.añadirBebida(bebida3)
    almacen.mostrarBebidas()
    operaciones.calcularPrecio("Coca Cola")
    operaciones.calcularPrecio(0)
    operaciones.calcularPrecio()
}