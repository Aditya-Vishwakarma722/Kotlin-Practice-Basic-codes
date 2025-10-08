package org.example

fun main(){
    print("Enter the First Number : ")
    var num1 = readln().toIntOrNull()?: 0
    print("Enter the Second Number : ")
    var num2 = readln().toIntOrNull() ?: 0
    print("Enter the Third Number : ")
    var num3 = readln().toIntOrNull() ?: 0

    var maxNum = when{
        num1>num2 && num1>num3 -> num1
        num2>num1 && num2>num3 -> num2
        else->num3
    }

    println("$maxNum is Greater")
}