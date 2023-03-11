package com.example.kotlinbasics

class Person (name: String, age: Int, override val game: String) : Work(), Game {
//class Person (name: String, age: Int) : Work(), Game {

    open fun work() {
        println("Esta persona está trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    // Game interface
    /*
    Podemos sobreescribir la información de la interfaz de varias formas, podemos acceder
    directamente al atributo y darle un valor antecediendo "override" si quieremos que el valor del
    atributo sea uno específico. Pero deberíamos agregarlo al constructor si este debe ser usado
    al momento de crear la instancia
     */
    // override  val game: String = "Among Us"
//    override val game: String
//        get() = "Among Us"


    override fun play() {
        println("Esta persona está jugando a $game")
    }


}