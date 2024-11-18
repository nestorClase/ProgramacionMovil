package Ejer2

class Operaciones(
    val bebidas: Array<Array<Bebidas?>>
){
    // Función para calcular el precio total de las bebidas
    fun calcularPrecio() {
        var precioTotal = 0.0
        for (fila in bebidas) {
            for (bebida in fila) {
                if (bebida != null) {
                    precioTotal += bebida.precio
                }
            }
        }
        println("El precio total de las bebidas es: $precioTotal")
    }

    fun calcularPrecio(marca: String) {
        var precioMarca = 0.0
        for (fila in bebidas) {
            for (bebida in fila) {
                if (bebida != null && bebida.marca == marca) {
                    precioMarca += bebida.precio
                }
            }
        }
        println("El precio total de las bebidas de la marca $marca es: $precioMarca")
    }


    //Funcion calcular precio de una fila
    fun calcularPrecio(fila: Int) {
        var precioFila = 0.0
        for (bebida in bebidas[fila]) {
            if (bebida != null) {
                precioFila += bebida.precio
            }
        }
        println("El precio total de las bebidas de la fila $fila es: $precioFila")
    }

}