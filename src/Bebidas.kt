package Ejer2

data class Bebidas(
    var id: Int=0,
    var cantidadLitros: Int=0,
    var precio: Double=0.0,
    var marca: String="",
    var Origen: String,
    var procentajeAzucar:Int ,
    var promocion: Boolean,
    var tipo:Int
){

    // Constructor
    constructor():this(0,0,0.0,"","",0,false,0){
        crearBebida()
    }

    // Función para crear una bebida
    fun crearBebidadatos(id: Int=0, cantidadLitros: Int=0, precio: Double=0.0, marca: String="", tipo:Int){
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

    fun crearBebida(){
        println("Ingrese el ID de la bebida")
        id = readLine()!!.toInt()
        println("Ingrese la cantidad de litros de la bebida")
        cantidadLitros = readLine()!!.toInt()
        println("Ingrese el precio de la bebida")
        precio = readLine()!!.toDouble()
        println("Ingrese la marca de la bebida")
        marca = readLine()!!

        println("Que tipo de bebida es: " +
                "\n1 AguaMineral" +
                "\n2 Refresco" +
                "\n porfavor ingrese el numero de seleccion")
        tipo= readLine()!!.toInt()
        while (true) {
            if (tipo == 1) {
                aguaMineral()
                break
            } else if (tipo == 2) {
                refresco()
                break
            }
            println("Porfavor ingrese un numero valido")
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
        while (true) {
            if (readLine()!!.toLowerCase() == "si") {
                promocion = true
                var promocion=precio*0.1
                precio=precio-promocion
                break
            } else if(readLine()!!.toLowerCase() == "no"){
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
