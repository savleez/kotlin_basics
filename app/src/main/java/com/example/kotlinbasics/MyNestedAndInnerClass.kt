package com.example.kotlinbasics

class MyNestedAndInnerClass {

    private val one = 1

    private fun returnOne() : Int {
        return one
    }

    /*
    Clase anidada
    Es una clase que está dentro de otra clase, pero que no puede acceder a la información de la
    clase superior. Se utiliza para la definición de funciones muy especializadas.
    Para instanciarla se puede llamar a través de la clase superior, pero sin instanciar esta

    val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
     */
    class MyNestedClass {

        fun sum(first: Int, second: Int) : Int {
            return first + second
        }
    }

    /*
    Clase interna
    Es una clase que está dentro de otra clase, pero a diferencia de una anidada, sí puede acceder
    a la información de la clase superior. Debemos especificarlo con la palabra reservada "inner".
    Para instanciarla hay que instanciar primero la clase superior.

val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
     */
    inner class MyInnerClass {

        fun sumOne(number: Int) : Int {
            return number + returnOne()
        }
    }
}