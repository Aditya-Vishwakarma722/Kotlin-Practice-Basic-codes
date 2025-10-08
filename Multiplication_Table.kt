package org.example

fun main(){
    print("Enter the Number : ")
    var number = readln().toIntOrNull()?: 1
    var i = 1

    while (i<=10){
        println("$number X $i = ${number*i}")
        i++
    }
}