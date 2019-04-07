package br.com.willtrkapp.trykotlin

fun main(){
    //List e MutableList
    var familia:List<String> = listOf<String>("Willian", "Mae", "Pai")

    familia = listOf<String>("Willian", "Mãe", "Pai", "Kito")

    //Loop
    for (integrante in familia)
        println(integrante)

    val listaInteiro : List<Int>  = listOf<Int> (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listaInteiro2 : List<Int>  = (1..10 step 2).toList()

    for (i in listaInteiro)
        println(i)

    //FOR com IntRange 1..10
    for (i in 0..9)
        println(listaInteiro[i])

    for (i in 0..listaInteiro2.size - 1)
        println(listaInteiro2[i])

    var listaCursos: MutableList<String> = mutableListOf ("Sistemas para dospositivos móveis", "Análise e Desenvolvimento de Sistemas")
    listaCursos.add("Técnico em informática para internet")

    //Percorrendo com lambda
    listaCursos.forEach() { println(it.toUpperCase()) }

    listaCursos.forEach(::println)

    listaCursos.forEach {println(it)}


}