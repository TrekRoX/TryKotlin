package br.com.willtrkapp.trykotlin

fun processaInteiro(i: Int, f: (j: Int) -> Int): Int{
    return f(i)
}

inline fun inverte(x: Int) : Int = x * -1

fun Int.executa(f: (Int) -> Int) : Int {
    return f(this)
}

fun main() {
    //Passando uma função comum como parametro
    val n : Int = processaInteiro(10, ::inverte)
    println(n)

    //Passando uma função lambda como parametro
    val n2: Int = processaInteiro(11, {x -> -1* x})
    println(n2)

    //Passando um funcao lambda como parametro, com um parametro apenas
    val n3: Int = processaInteiro(12, {-1* it})
    println(n3)

    //Passando um funcao lambda como ultimo parametro
    val n4: Int = processaInteiro(13) {-1* it}
    println(n4)

    //Passando lambda para uma funcao estendida
    val n5: Int = 14.executa() { -1 * it }
    println(n5)

    //Passando lambda para uma funcao estendida
    val n6: Int = 15.executa { -1 * it }
    println(n6)

    //Atribuindo
    val funcaoLambda :(Int) -> Int = {x: Int -> -1* x }
    val n7 : Int = processaInteiro(16, funcaoLambda)
    println(n7)

    val funcaoLambda2 = {x: Int -> -1* x }
    val n8 : Int = processaInteiro(17, funcaoLambda2)
    println(n8)


}