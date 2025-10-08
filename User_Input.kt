package org.example

fun main(){
    print("Enter the Statement below : ")
    val statement = readln()

    print("Your Entered Statement is : ")
    println(statement.uppercase())

    //NULLABILITY
    print("Now Enter Some Number : ")
    val obj = readln().toIntOrNull()

    println("You've Entered : $obj")

    print("Enter a number to Check whether it is Odd or Even : ")
    val input = readln().toIntOrNull() ?: 0
    val isEven = (input!! % 2)?.equals(0)
    println("$input is Even? : $isEven")
}