package com.pboox.androidmaster

// VARIABLES

/**
 * Variables
 */

fun main(){

/**
*   Variables numericas
*/

//    Int -2 a 2,147,483,647
    val age:Int = 45

    var age2:Int = 15
    println(age2)
    age2 = 16
    println(age)
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

//    Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
    val booleanExample3 = true

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