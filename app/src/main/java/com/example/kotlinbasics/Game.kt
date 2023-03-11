package com.example.kotlinbasics

interface Game {
    /*
    Podemos definir atributos y métodos que luego puedan ser utilizados por las clases que
    extiendan la interfaz.

    Cuando se definen atributos o métodos, pero no son inicializados, deben ser inicializados
    desde la clase que los herede, en este caso se debe definir Game y Play(), mientras que no
    hace falta sobreescribir stream, puesto que ya está inicializada.

    Las interfaces no pueden tener constructores porque las inicializaciones se realizan al
    momento de instanciar la clase
     */

    // Se pueden definir, pero no inicializar
    val game: String

    /*
    Se puede evadir el problema de la definición de esta forma, lo que hacemos es crear un tipo
    de funión que retorna un valor y es asignado al atributo, en lugar de guardar la información
    en la misma interfaz
     */
    val game2: String
        get() = "The Legend of Zelda"

    fun play()

    fun stream() {
        println("Estoy haciendo stream de mi juego $game")
    }
}