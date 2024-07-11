package com.pboox.androidmaster


// VARIABLES
val age:Int = 45

/**
 * Variables
 */

fun main(){

    showMyName()
    showMyAge(26)
    add(10, 20)
    val resta = subtract(10, 5)
    println(resta)
    val resta2 = subtract2(100, 20)
    println(resta2)
    showMyNewAge()

}

fun showMyName(){
    println("Me llamo Pedro")
}

fun showMyAge(currentAge:Int){
    print("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}
fun subtract2(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

fun showMyNewAge(currentAge: Int = 30){
    println("Tengo $currentAge años")
}


fun variablesNumericas() {

/**
 *   Variables numericas
 */

//    Int -2 a 2,147,483,647
    val age1:Int = 45

    var age2:Int = 15
    println(age2)
    age2 = 16
    println(age1)
//    Long
    val example:Long = 30
//    Float
    val floatExample:Float = 30.5f
//    Double
    val doubleExample:Double = 123.41231423123

    println("Sumar:")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("División")
    println(age / age2)

    println("Módulo")
    println(age % age2)

    var exampleSuma = age + floatExample
    println("Suma de variable con diferente tipo")
    println(exampleSuma)
}

fun variablesBooleanas() {
/**
 *  Variables booleanas
 */
//    Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3 = true
}

fun variablesAlfaNumericas() {
/**
 *  Variables alfanumericas
 */
//    Char
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

//    String
    val stringExample:String = "Pedro Cajas"
    val stringExample2:String = "2"
    val stringExample3:String = "45"


//    Concatenar

    println(stringExample2 + stringExample3)

//    referenciar variables dentro de string
    var stringConcatenada: String = "Hola"
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $stringExample"
    println(stringConcatenada)

//    convertir variables
    val exampleStringInt: String = age.toString()
    println(exampleStringInt)
}