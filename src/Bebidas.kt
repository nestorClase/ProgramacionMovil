package Ejer2

class Bebidas() {
    // Propiedades de la bebida
    var id: Int = 0
    var cantidadLitros: Int = 0
    var precio: Double = 0.0
    var marca: String = ""
    var tipo: Int = 0
    var Origen: String = ""
    var procentajeAzucar: Int = 0
    var promocion: Boolean = false

    // Función para crear una bebida
    fun crearBebidadatos(id: Int, cantidadLitros: Int, precio: Double, marca: String, tipo:Int){

        this.id=id
        this.cantidadLitros=cantidadLitros
        this.precio=precio
        this.marca=marca
        this.tipo=tipo
        if (tipo==1){
            aguaMineral()
        }else if(tipo==2){
            refresco()
        }
    }

    fun aguaMineral(){
        println("Ingrese el origen del agua mineral")
            Origen = readLine()!!
    }

    fun refresco(){
        println("Ingrese la cantidad de azucar del refresco")
        procentajeAzucar = readLine()!!.toInt()
        println("Tiene promocion(Si/No)")
        var respuesta = readLine()!!.toLowerCase()
        while (true) {
            if (respuesta == "si") {
                promocion = true
                var promocion=precio*0.1
                precio=precio-promocion
                break
            } else if(respuesta == "no"){
                promocion = false
                break
            }
            println("Porfavor ingrese si o no")
        }
    }

    // Función para mostrar los datos de la bebida
    fun mostrarDatos() {
        if (this.tipo==1){
            println("ID: $id")
            println("Cantidad de litros: $cantidadLitros")
            println("Precio: $precio")
            println("Marca: $marca")
            println("Origen: $Origen")
        }else if(this.tipo==2){
            println("ID: $id")
            println("Cantidad de litros: $cantidadLitros")
            println("Precio: $precio")
            println("Marca: $marca")
            println("Porcentaje de azucar: $procentajeAzucar%")
            println("Promocion: $promocion")
        }
    }
}
