import java.util.Scanner

fun main() {
    println(temperaturas(1,25.5))
    println(temperaturas(2,25.5))
    println(temperaturas(3,25.5))
}

fun temperaturas(formula:Int,temp:Double) {
    var operacion:Double=0.0
    when(formula){
        1->{
            operacion=(temp*1.8+32)
            println("$temp grados Celsius son $operacion grados Fahrenheit.")
        }
        2->{
            operacion=(temp-273.15)
            println("$temp grados Kelvin son $operacion grados Celsius.")
        }
        3->{
            operacion=(5/9*(temp-32)+273.15)
            println("$temp grados Fahrenheit son $operacion grados Kelvin.")
        }
    }
}

fun entradas(edad:Int,Lunes:Boolean){

        when (edad) {
            in 1..12 -> println("El precio de la entrada al cine para una persona de $edad es de 5.4 euros.")
            in 13..60->if (Lunes==true) println("El precio de la entrada al cine para una persona de $edad es de 6.7 euros.")
            else println("El precio de la entrada al cine para una persona de $edad es de 8.5 euros.")
            in 61..100-> println("El precio de la entrada al cine para una persona de $edad es de 5 euros.")
            else-> println("$edad no es una edad valida")
        }
}

fun notificaciones (numero:Int){
    if(numero<100) println("Tienes $numero notificaciones." )
    else println("¡Tu telefono esta explotando! Tienes 99+ notificaciones.")

    /*
    when(numero){
        in 0 .. 99-> println("Tienes $numero notificaciones." )
        !in 0 .. 99 -> println("¡Tu telefono esta explotando! Tienes 99+ notificaciones.")
    }
     */
}

fun cuatrimestr(mes:Int){
    when (mes) {
        1,2,3,4-> println("Primer cuatrimestre")
        5,6,7,8-> println("segundo cuatrimestre")
        10,11,12-> println("Tercer cuatrimestr")
        else-> println("no es un mes")

    }

}