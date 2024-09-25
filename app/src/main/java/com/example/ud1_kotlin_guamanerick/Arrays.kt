package com.example.ud1_kotlin_guamanerick

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays.size)

    for(pos in weekDays.indices){
        println("$pos:")
        println(weekDays[pos])
    }

    for((pos,value) in weekDays.withIndex())
    {
        println("$pos:$value")
    }

    for(day in weekDays) println("$day,")
}