package Ejer2

class Operaciones(
    val bebidas: Array<Array<Bebidas?>>
){
    // Función para calcular el precio total de las bebidas
    fun calcularPrecio(): Double {
        var precioTotal = 0.0
        for (fila in bebidas) {
            for (bebida in fila) {
                if (bebida != null) {
                    precioTotal += bebida.precio
                }
            }
        }
        return precioTotal
    }

    // Función para calcular el precio total de bebidas de una marca
    fun calcularPrecio( marca: String): Double {
        var precioMarca = 0.0
        for (fila in bebidas) {
            for (bebida in fila) {
                if (bebida != null && bebida.marca == marca) {
                    precioMarca += bebida.precio
                }
            }
        }
        return precioMarca
    }

    //Funcion calcular precio total de bebidas de una columna

}