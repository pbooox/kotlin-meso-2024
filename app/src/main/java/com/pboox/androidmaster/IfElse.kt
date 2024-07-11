package com.pboox.androidmaster

fun main () {
}

fun ifBasico () {
    val name = "Pedro"

    if(name == "Juan") {
       println("La variable name es Pedro")
    } else {
        println("Este no es Pedro")
    }
}

fun ifAnidado () {
    val animal = "perro"

    if (animal =="perro") {
        println("Es un perro")
    } else if (animal == "gato") {
        println("Es un gato")
    } else if (animal == "pajaro") {
        println("Es un pajaro")
    } else {
        println("No es uno de los animales esperados")
    }
}

fun ifBoolean() {
    var feliz: Boolean = false

    if (!feliz){
        println("Estoy triste ):")
    }

    if (feliz) {
        println("Estoy feliz :)")
    }
}

fun ifInt(){
    val age = 18
//    ==, <, >, <=, >=, !=
    if(age >= 18) {
        println("Puede entrar")
    } else {
        println("No puede entrar")
    }
}

fun ifMultiple() {
    var edad = 18
    var permiso = false
    var feliz = true

//    && and || or
    if(edad >= 18 && permiso && feliz) {
        println("Puede entrar")
    }
}
