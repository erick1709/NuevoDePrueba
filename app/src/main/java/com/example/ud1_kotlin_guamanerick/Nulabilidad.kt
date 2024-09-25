package com.example.ud1_kotlin_guamanerick

fun main()
{
    var name:String = "Erick"
    var name2:String? = null
    println(name)
    println(name2)

    if(name == "Erick"){}
    if (name.substring(0) == "Erick"){}

    if (name2 != null) {
        if (name2.substring(2) == "Erick") {}
    }

    //if(name2!![0] == 'E'){} //!! Seguro que no es nulo
    //name2!!.substring(1)

    if(name2?.get(0) == 'E'){

    }else println("No entra")

    println(name2?.get(0) ?: "Es nulo")//? si no es nulo, dame el valor
    //name2 = "hola"
    println(name2?.get(0) ?: "Es nulo")//? si no es nulo, dame el valor
    showText(name2)
    var aux = showText(name)
    var aux2:Int? = null
}

fun showText(text: String?):Int?{
    println(text)
    return if(text?.length ?:0 > 5){
        10
    } else null
}