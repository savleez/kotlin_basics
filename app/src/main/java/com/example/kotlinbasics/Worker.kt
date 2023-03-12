package com.example.kotlinbasics

/*
Se diferencia de una clase normal porque se antecede la palabra reservada data

Se sugiere que los atributos sean constantes

Los paréntesis funcionan como constructor (Primario), los atributos que se definen allí se pueden
tomar como obligatorios, aunque se les puede dar un valor por defecto para que no lo sean.

Se puede utilizar un constructor secundario usando la palabra reservada constructor, y
especificando los atributos y las asignaciones (Similar a como es en Java)

Para agregar atributos opcionales (No hacen parte del constructor) los podemos definir e
inicializar dentro del cuerpo de la clase.
 */
data class Worker(
    val name: String = "",
    val age: Int = 0,
    val work: String = ""
) {
    var lastWork: String = ""
}
