package com.pboox.androidmaster.sintaxis

fun main(){
//    Indice 0-6
//    Tamaño 7
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

//    println(weekDays[0])
//    println(weekDays.size)

    //Tamaños
    if (weekDays.size >= 7) {
//        println(weekDays[6])
    } else {
//        println("No hay mas valores en el array")
    }

    //Modificar valores
//    weekDays[0] = "Feliz lunes"
//    println(weekDays[0])


    //Bucles para Arrays
    for(position in weekDays.indices){
//       println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
//        println("La posición $position, contiene $value")
    }

    for (weekday in weekDays){
//        println("Ahora es $weekday")
    }

//    weekDays.forEach { println(it) }
    weekDays.forEach { weekDay -> println(weekDay) }
}