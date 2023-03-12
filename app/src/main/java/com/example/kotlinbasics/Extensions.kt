package com.example.kotlinbasics

import java.text.SimpleDateFormat
import java.util.*


/*
Queremos extender una funcionalidad de la clase Date, en este caso agregamos un método a una clase
ya existente.
 */

// Agregamos ? a Date y a String para indicar que el objeto fecha y el retorno pueden ser nulos
fun Date?.customFormat() : String? {
    /*
    Queremos tener un formato específico para las fechas
     */
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    // this hace referencia al mismo objeto de fecha que se está evaluando
    if (this != null) {
        return formatter.format(this)
    }
    return null
}

// Debido a que customFormat puede retornar un nulo, agremamos una expresión ?: para considerarlo
val Date.formatSize: Int
    get() = this.customFormat()?.length ?: 0