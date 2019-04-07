package br.com.willtrkapp.trykotlin

fun main()
{
    var listCursos: MutableList<String> = mutableListOf("Sistemas para Dispositivos Móveis", "Análise e Desenvolvimento de Sistemas")
    listCursos.add("Técnico em Informática para Internet")
    listCursos.add("Manutenção de Aeronaves")
    listCursos.add("Técnico em Células")
    listCursos.add("Processos Gerenciais")

    //var listaCursosSistemas : List<String> = listCursos.contains("Sistemas")

    //1
    var listaCursosSistemas = listCursos.filter { s -> s.contains("Sistemas") }
    listaCursosSistemas.forEachIndexed { index, element -> println("${index} - ${element}") }

    //2
    var listaCursosSistemas2 = listCursos.filter { it.contains("Sistemas") }
    listaCursosSistemas2.withIndex().forEach{ println("${it.index} - ${it.value}")}

    //3
    fun imprime(ci: IndexedValue<String>)
    {
        println("${ci.index} - ${ci.value}")
    }

    var listaCursosSistemas3 = listCursos.filter { it.contains("Sistemas") }
    listaCursosSistemas3.withIndex().forEach{ imprime(it) }

}