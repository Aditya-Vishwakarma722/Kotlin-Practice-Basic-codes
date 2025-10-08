package org.example

fun main(){
    print("Enter the Marks : ")
    var marks = readln().toDoubleOrNull() ?: -1.0

    var grade = when{
        marks <= 100 && marks >=91 ->"A"
        marks <= 90 && marks >=81 ->"B"
        marks <= 80 && marks >=71 ->"C"
        marks <= 70 && marks >=61 ->"D"
        marks <= 60 && marks >=51 ->"E"
        marks <= 50 && marks >=0 ->"F"
        else-> "Invalid"
    }

    println("Based on the Marks : Grade $grade")
}