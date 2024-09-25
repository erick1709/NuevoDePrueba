package com.example.ud1_kotlin_guamanerick

fun main()
{
    getMonth(4)
    getTrim(2)
    getSem(24)
}

fun getMonth(month:Int)
{
    when (month)
    {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else ->
        {
            println("No")
            println("es")
            println("un")
            println("mes")
        }

    }
}

fun getTrim(month:Int)
{
    when(month)
    {
        1,2,3 -> println("1º Trimestre")
        4,5,6 -> println("2º Trimestre")
        7,8,9 -> println("3º Trimestre")
        10,11,12 -> println("4º Trimestre")
        else ->
            {
                println("No")
                println("es")
                println("un")
                println("mes")
            }

    }
}

fun getSem(month:Int)
{
    when(month)
    {
        in 1..6 -> println("1º Semestre")
        in 7..12 -> println("2º Semestre")
        !in 1..12 -> println("No es un mes v�lido")
    }
}

fun result(value:Any)
{
    when(value)
    {
        is Int -> println(value+10)
        is String -> println(value)
        is Boolean -> if(value) println("yes")
        else -> println("No s� qu� tipo es ese")
    }
}

fun result2(value:Any):Any
{
    var resultado=
    when(value)
    {
        is Int -> value*value
        is String -> value+value
        is Boolean -> !value
        else -> "No s� qu� tipo es ese"
    }
    return resultado
}

fun result3(value:Any)= when(value) {
            is Int -> value*value
            is String -> value+value
            is Boolean -> !value
            else -> "No s� qu� tipo es ese"
        }
