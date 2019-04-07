package br.com.willtrkapp.trykotlin

fun soma(i: Int, j: Int) = i + j
fun cat (i: String, j: String) : String = "${i}${j}"

fun foo(i: Int, f: Int, k: (j: Int, f:Int) -> Int): Int{
    return k(i, f)
}

fun bar (x: String, y: String, g:(String, String) -> String) : String = g(x, y)

fun <T>xpto(i: T, f: T, j:(T, T) -> T) : T = j(i, f)

//Exec 5
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int) : Int{
    return f(i, j)
}

fun multiplica(i : Int, x : Int) : Int {
    return i * x;
}

fun raizQuadrada(numero : Int) : Int {
    for (n in 1..numero)
    {
        if(n * n == numero)
            return  n;
    }
    return -1;
}

fun main(){
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))


    println(xpto(2,3, :: soma))
    println(xpto("Jo","ão", :: cat))


    //Exercicio 5, chamada 1
    println(processaInteiros(10, 20, :: soma))
    println(processaInteiros(9, 9, :: multiplica))
    println(processaInteiro(9, :: raizQuadrada))

    //Exercicio 5, chamada 2 passando lambda


}