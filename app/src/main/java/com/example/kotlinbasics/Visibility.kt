package com.example.kotlinbasics

// Solo se puede acceder a una clase privada desde el mismo fichero
private class PrivateVisibility {

    // Solo se puede acceder a un atributo privado desde la misma clase.
    private var name: String? = null

    /*
    Al no tener un modificador de acceso, por defecto se le asigna public

    Como el atributo name puede ser nulo, podemos usar el método let para ejecutar algo en caso de
    que name no sea nulo, en caso contrario se ejecuta run

    Solo se puede acceder a un atributo privado desde la misma clase.
     */
    private fun sayMyName() {
        name?.let {
            println("Mi nombre es $it")
        } ?: run {
            "No tengo nombre"
        }
    }
}


// Usamos open para poder que se pueda heredar
open class VisibilityTwo {

    // Protected permite que el método sea usado desde las clases hijas, pero no desde instancias
    protected fun sayMyName2() {
        // SI podemos instanciar la clase porque está definida en el mismo fichero
        val visibility = PrivateVisibility()

        // No podemos acceder al método porque es privado.
        // visibility.sayMyName()
    }
}


class Visibility3: VisibilityTwo() {

    // No es muy usado, pero define que solamente se pueda acceder desde el módulo (Compilado)
    internal val age: Int? = null

    fun sayMyName3() {
        // Podemos usar el método porque es protected.
        sayMyName2()
    }

}