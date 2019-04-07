package br.com.willtrkapp.trykotlin

fun main() {
    //String com tipo explícito
    var nome : String = "Willian"

    //Tipo determinado implicitamente
    var sobrenome = "Lima"

    // Var e Val podem ser inicializados a posteriori
    var nomeMeio : String
    nomeMeio = "De"

    //Float
    var altura :Float = 1.74f

    //Inteiro
    var idate: Int = 28

    var peso : Double = 75.toDouble()

    println("Nome: ${nome}  ${nomeMeio} ${sobrenome} altura: ${altura}, idade ${idate}, peso ${peso} ")
}