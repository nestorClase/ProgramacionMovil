package Ejer2

class Almacen {

    // Matriz bidimensional de bebidas (5x5)
    var bebidas = Array(5) { arrayOfNulls<Bebidas>(5) }

    // Función para añadir una bebida a la matriz
    fun añadirBebida(bebida: Bebidas) {
        // Comprobar si el ID de la bebida ya existe
        if(comprobarID(bebida.id)){
            println("La bebida ya existe")
            return
        }
        // Recorrer cada fila de la matriz
        for (fila in bebidas) {
            // Recorrer cada bebida en la fila (sub-array)
            for (i in 0 until fila.size) {
                //
                if (fila[i] == null) {
                    fila[i] = bebida  // Si encuentra un espacio vacío, añade la bebida
                    return
                }
            }
        }
    }

    // Funcion para eliminar la bebida de la matriz
    fun eliminarBebida(id: Int) {
        // Recorrer cada fila de la matriz
        for (fila in bebidas) {
            // Recorrer cada bebida en la fila (sub-array)
            for (i in 0 until fila.size) {
                // Comprobar si bebida no es null y si el ID coincide
                if (fila[i]?.id == id) {
                    fila[i] = null  // Si encuentra el ID, elimina la bebida
                    return
                }
            }
        }
    }

    // Función para comprobar si un ID existe en la matriz de bebidas
    fun comprobarID(id: Int): Boolean {
        // Recorrer cada fila de la matriz
        for (fila in bebidas) {
            // Recorrer cada bebida en la fila (sub-array)
            for (bebida in fila) {
                // Comprobar si bebida no es null y si el ID coincide
                if (bebida?.id == id) {
                    return true  // Si encuentra el ID, devuelve true
                }
            }
        }
        return false  // Si no encuentra el ID, devuelve false
    }

    //Funcion mostrar todas las bebidas
    fun mostrarBebidas(){
        for (fila in bebidas) {
            for (bebida in fila) {
                if (bebida != null) {
                 bebida.mostrarDatos()
                }
            }
        }
    }

}
