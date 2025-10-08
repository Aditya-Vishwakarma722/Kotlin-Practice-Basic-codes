package org.example

fun main(){
    print("Enter the First Number : ")
    var num1 = readln().toDoubleOrNull() ?: 0.0
    print("Enter the Second Number : ")
    var num2 = readln().toDoubleOrNull() ?: 0.0

    println("Addition of $num1 & $num2 = ${num1+num2}")
    println("Subtraction of $num1 & $num2 = ${num1-num2}")
    println("Multiplication of $num1 & $num2 = ${num1*num2}")
    println("Division of $num1 & $num2 = ${num1/num2}")
}