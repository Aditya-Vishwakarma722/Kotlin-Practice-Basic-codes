package org.example

fun main(){
    print("Enter a Number : ")
    var num = readln().toIntOrNull() ?: 0
    if ((num%2) == 0){
        println("$num is Divisible by 2,\nTherefore, it is an Even Number.")
    }
    else{
        println("$num is not Divisible by 2,\nTherefore, it is an Odd Number.")
    }
}