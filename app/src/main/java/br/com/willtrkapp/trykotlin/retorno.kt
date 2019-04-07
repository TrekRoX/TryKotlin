package br.com.willtrkapp.trykotlin

enum class TIPO_OPERACAO {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO
}

fun subtracao(a: Int, b: Int) : Int {
    return a-b;
}

fun operacao(op: TIPO_OPERACAO) : (Int, Int) -> Int {
    val divisao : (Int, Int) -> Int = {x, y -> x/y }

    when (op){
        TIPO_OPERACAO.SOMA -> return fun (a: Int, b: Int): Int = a + b;
        TIPO_OPERACAO.SUBTRACAO -> return :: subtracao;
        TIPO_OPERACAO.MULTIPLICACAO -> return {c: Int, d: Int -> c * d};
        TIPO_OPERACAO.DIVISAO -> return divisao
    }
}

fun executaOperacao(i: Int, j: Int, f:(Int, Int) -> Int) : Int{
    return f(i, j)
}

fun main() {
    // soma
    //var acao = operacao(TIPO_OPERACAO.SOMA)
    var acao : (Int, Int) -> Int = operacao(TIPO_OPERACAO.SOMA)
    var soma: Int = executaOperacao(20, 10, acao)
    println("Soma ${soma}")

    //Subtracao
    acao = operacao(TIPO_OPERACAO.SUBTRACAO)
    println("Subtracao: ${executaOperacao(20, 10, acao)}")

    //Multiplicacao
    var multiplicacao = executaOperacao(20, 10, operacao(TIPO_OPERACAO.MULTIPLICACAO))
    println("Multiplicacao: ${multiplicacao}")

    //Divisao
    println("Divisao: ${executaOperacao(20, 10, operacao(TIPO_OPERACAO.DIVISAO))}")



}