package com.example.ud1_kotlin_guamanerick

fun main()
{
    mutableListOf()
    //inmutableListOf()
}

fun inmutableListOf(){
    val readOnlyList:List<String> = listOf("PMDM", "ADA", "DIN", "SGE", "INT","EIE", "PSP", "PDAM")

    println("PRINT CON .TOSTRING()")
    println(readOnlyList.toString())

    println("PRINT CON FOR EACH CL�SICO")
    for(asignatura in readOnlyList){
        println(asignatura)
    }

    println("PRINT CON FOR EACH LAMBDA (usando it)+r�pido")
    readOnlyList.forEach{
        println(it)
    }

    var listaFiltrada = readOnlyList.filter {
        it.contains("p", true)
    }

    var listaFiltrada2 = readOnlyList.filter {
        it.startsWith("a", true)
    }

    println("PRINT CON FOR EACH LAMBDA (usando nombre de variable)")
    println(listaFiltrada.size)
    listaFiltrada.forEach{ asignatura ->
        println(asignatura)
    }



    println("PRINT CON FILTER")
}

fun mutableListOf(){
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday")
    weekDays.add("Friday")
    println(weekDays)
    weekDays.add(3, "Thursday")
    println(weekDays)
    weekDays.add("Invented")
    println(weekDays)
    println( weekDays.remove("Invent"))
    println(weekDays)
    println(weekDays.remove("Invented"))
    println(weekDays)
}