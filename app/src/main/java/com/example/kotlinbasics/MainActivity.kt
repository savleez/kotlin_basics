package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList

// TypeAlias que puede ser reusado más abajo sin tener que especificar el tipo de dato
typealias MyMapList = MutableMap<Int, ArrayList<String>>

// type alias de una función donde se especifican los argumentos que recibe y lo que retorna
typealias  MyFunArgs = (Int, String, MyMapList) -> Boolean

// type alias de una clase aninada
typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables y constantes
        // variablesAndConstants()

        // Tipos de datos
        // dataTypes()

        // Sentencia If
        // conditionals()

        // Arrays
        // arrays()

        // Maps o diccionarios
        // maps()

        // Bucles
        // loops()

        // Null safety
        // nullSafety()

        // Funciones
        // functions()

        // Classes
        // classes()

        // Enum classes
        // enumClasses()

        // Clases anidadas
        // nestedAndInnerClasses()

        // ...

        // Interfaces
        // interfaces()

        // Modificadores de visibilidad
        // visibilityModifiers()

        // Data classes
        // dataClasses()

        // Alias de tipos
        // typeAliases()

        // Desestructuración de datos
        // destructuringDeclarations()

        // Extensiones
        // extensions()

        // Lambdas
        lambdas()
    }

    // 1. Variables y constantes
    private fun variablesAndConstants() {
        /*
        Las variables y constantes se deberían nombrar en formato camel case.
        Podemos definirlas sin especificar el tipo de dato que va a contener.
        Aún así, una vez son definidas de un tipo de dato, este no se puede cambiar
        por otro tipo de dato.
        */
        var myVariable = "Hello world!" // String
        println(myVariable)
        // myVariable = 3 // Error, no se puede cambiar el tipo de la variable.
        myVariable = "Hello world 2!"
        println(myVariable)

        // Podemos especificar el tipo de dato
        var myFirstNumber: Int = 2


        // Una constante es una variable que no puede cambiar su valor en el tiempo de ejecución
        val myFirstConstant = "Valor de la constante"
        // myFirstConstant = "Otro string" // Error, no se puede cambiar el valor de una constante
        val mySecondConstant = myVariable
    }

    private fun dataTypes() {
        /*
        Kotlin tiene 4 tipos de datos principales:
            - Strings -> Str
            - Enteros -> Int
            - Decimales -> Decimal
            - Booleanos -> bool
        */


        // String
        val myString = "Hola mundo"
        val myString2: String = "Hola mundo 2"

        // Podemos concatenar strings sumándolos
        val myString3 = myString + " " + myString2
        println(myString3)

        /*
         También se pueden concatenar usando un template que es un string donde podemos reemplazar
         una parte del string por el valor de una variable usando el signo $, en el caso de que se
         quiera reemplazar el mero valor de una variable simplemente poner el nombre de la variable
         después del signo, pero si es una expresión debe ir encerrada en llaves después del signo
        (Son como los fstrings de python).
         */
        val myString4 = "$myString $myString2"
        println(myString4)
        println("El texto $myString tiene ${myString.length} caracteres")

        // Enteros (Byte, Short, Int, Long según la el tamaño de la variable)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double según el tamaño de la variable)
        val myFloat: Float = 1.5f
        val myDouble: Double = 1.5
        val myDouble2: Double = 2.6
        val myDouble3 = 1 // Kotlin castea enteros a doubles para hacer la operación
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)


        // Booleanos (Bool)
        val myBool = true
        val myBool2: Boolean = false

    }

    private fun conditionals() {
        /*
        Se utilizan para controlar el flujo de ejecución del programa utilizando condiciones.
        Se declaran con la condición entre paréntesis y el bloque entre llaves.

        Operadores condicionales:
            >  Mayor que
            <  Menor que
            >=  Mayor o igual que
            <=  Menor o igual que
            ==  Igualdad
            !=  Desigualdad

        Operadores lógicos:
            &&  "y"
            ||  "o"
            !  "no"
         */

        val myNumber = 60

        if ((myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5. O igual a 53")
        } else if (myNumber == 60) {
            println("$myNumber es igual a 60")
        } else {
            println("$myNumber es mayor que 10 o menor o igual que 5.")
        }


        /*
        También podemos utilizar condiciones con la sentencia when, que es el equivalente de switch
        Se evalúa la condición o el rango de valores si se está evaluando un entero.
         */

        val country = "Colombia"

        // When con strings
        when (country) {
            "España", "Mexico", "Colombia" -> {
                println("El idioma es español")
            }
            "EEUU" -> {
                println("El idioma es inglés")
            }
            "Francia" -> {
                println("El idioma es francés")
            }
            else -> {
                println("No se conoce el idioma")
            }
        }

        // When con enteros o rangos (incluyendo)
        val age = 10

        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            }
            in 3 ..10 -> {
                println("Eres un niño")
            }
            in 11 .. 17 -> {
                println("Eres un adolescente")
            }
            in 18 .. 69 -> {
                println("Eres un adolescente")
            }
            in 69 .. 100 -> {
                println("Eres un adolescente")
            }
            else -> {
                println("😱")
            }
        }

    }

    private fun arrays() {

        /*
        Los arrays son el equivalente de las listas de python, es decir que pueden guardar varios
        elementos de forma ordenada (Se tienen en cuenta los índices), y no importa que los
        elementos se repitan.

        arrayListOf<TIPO_DATOS>()  ->  Crea un array vacío
        arrayListOf<TIPO_DATOS>("a", "b")  ->  Crea un array con los elementos indicados
         */
        val name = "Sergio"
        val surname = "Velez"
        val age = "27"

        // Creación del arreglo vacío
        val myArray = arrayListOf<String>()

        // Adición de datos uno a uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(age)
        // myArray.add(age) // Los valores se pueden repetir

        // Creación con varios valores
        val myArray2 = arrayListOf<String>(name, surname, age)

        println(myArray)
        println(myArray2)

        /*
        Podemos agregar más de un elemento a la vez usando el método "addAll()" sobre un array,
        de esta forma podemos pasar un segundo array como argumento para concatenarlos o ejecutar
        el método "listOf" para pasar los valos individuales
         */
        // myArray.addAll(myArray2)
        myArray.addAll(listOf("Hola", "Qué tal"))

        println(myArray)

        /*
        Podemos acceder a los valores que tenga un array igual que en python, es decir, podemos
        especificar el índice del elemento al que se quiere acceder, iniciando desde cero.
        También podemos modificar el valor de la misma manera.
         */

        val userName = myArray[0]
        println(userName)

        myArray[3] = "Hello"
        println(myArray)

        // Podemos eliminar un valor usando el índice
        myArray.removeAt(4)
        println(myArray)


        /*
        Podemos iterar por los elementos del array, el valor de cada elemento del array se almacena
        en una variable que se llama "it". En este ejemplo simplemente se imprime el valor.
         */
        myArray.forEach {
            println(it)
        }

        // Tamaño del array
        myArray.count()

        // Acceder al primer y al último elemento del array
        myArray.first()
        myArray.last()

        // Eliminar todos los elementos del array
        myArray.clear()

    }

    private fun maps() {
        /*
        Podemos crear maps, que son el equivalente de un diccionario, que son estructuras
        desordenadas (No importa el índice) pero cuyas llaves no pueden tener valores repetidos.

        Mapas no mutables, o sea que no pueden agregarse nuevos elementos
        VAR: Map<TIPO_LLAVE, TIPO_VALOR> = mapOf()  -> Mapa vacío
        VAR: Map<TIPO_LLAVE, TIPO_VALOR> = mapOf("Sergio" to 1, "Mafe" to 2)  -> Mapa con elementos

        Para los mapas mutables se aplican los dos casos anteriores, solamente cambiando el método
        de creación del mapa
        VAR: Map<TIPO_LLAVE, TIPO_VALOR> = mutableMapOf()  -> Mapa mutable vacío
         */
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        // Añadir elementos.
        // En este caso reemplazamos too el mapa por uno nuevo con valores
        myMap = mapOf("Sergio" to 1, "Mafe" to 2)
        println(myMap)

        // En este caso agregamos valores uno a uno. Solo en mapas mutables
        var myMutableMap: MutableMap<String, Int> = mutableMapOf("Sergio" to 1, "Mafe" to 2)

        myMutableMap["Andres"] = 3
        myMutableMap.put("Maria", 8)

        println(myMutableMap)

        // Podemos acceder o modificar los valores de la misma forma que como los podemos agregar
        myMutableMap["Andres"] = 10
        myMutableMap.put("Maria", 18)

        println(myMutableMap)

        // Podemos eliminar una llave y su valor con .remove(), especificando la llave
        myMutableMap.remove("Maria")
        println(myMutableMap)

        // Los valores pueden ser de cualquier tipo si indicamos que el tipo es Any
        var myMutableMap2: MutableMap<String, Any> = mutableMapOf("Sergio" to 1, "Mafe" to "Mafe")
        var myMutableMap3: MutableMap<Any, Any> = mutableMapOf(1 to 1, "Mafe" to "Mafe")

        println(myMutableMap2)
        println(myMutableMap3)
    }

    private fun loops() {
        /*
        Sirven para recorrer estructuras de arrays o mapas.

        Los ciclos For funcionan igual que en python (foreach), donde en cada ciclo la variable
        toma el valor de cada elemento.
         */
        var userDataArray = arrayListOf<Any>("Sergio", 27)
        var userDataMap: MutableMap<String, Any> = mutableMapOf("name" to "Sergio", "age" to 27)

        // For
        for (element in userDataArray) {
            println(element)
        }

        for (element in userDataMap) {
            println("Llave: ${element.key}, valor ${element.value}")
        }

        // También podemos recorrer rangos (For por índice)
        // En este caso incluye ambos números (11 elementos)
        for (x in 0 .. 10) {
            println(x)
        }

        // En este caso no se incluye el final (10 elementos)
        for (x in 0 until 10) {
            println(x)
        }

        // Podemos especificar el tamaño del paso
        for (x in 0 until 10 step 2) {
            println(x)
        }

        // Podemos especificar que sea de forma descendente (Y en este caso el step también)
        for (x in 10 downTo  0 step 2) {
            println(x)
        }

        // También se puede crear un array con esta forma
        var myNumericRange = (0..20)


        // Ciclo while

        var x = 0

        while (x < 10) {
            println(x)
            x++ // Incrementa 1
            x += 2 // Suma 2 al valor previo
        }
    }

    private fun nullSafety() {
        /*
        Kotlin provee varias formas de garantizar la integridad de la información y errores con
        valores nulos.
        Los tipos de datos por defecto no aceptan los valores nulos, por lo que si sabemos que un
        valor puede llegar a ser nulo debemos agregar un ? al momento de la declaración
         */

        var myString =  "Sergio"
        // myString = null // Esto daría error porque un String no puede ser nulo

        // Variable nullable
        var mySafetyString: String? = "Sergio"
        println(mySafetyString)

        mySafetyString = null
        println(mySafetyString)

        // mySafetyString = "Andres"
        // println(mySafetyString)

        // Podemos comprobar que una variable no sea nula con una condición
        // En este caso no se ejecuta el bloque de código si no se cumple la condición
        if (mySafetyString != null) {
            println("La variable no es nula")
        } else {
            println("La variable es nula")
        }

        /*
         Para acceder a cualquier propiedad o realizar una operación sobre una variable que puede
         ser nula debemos usar el operador "!!", de esta forma utilizaríamos la variable con
         normalidad si no es nula, pero se levantaría una excepción en caso de que sí sea nulo
        */
        var stringVar: String? = "Texto"
        println(stringVar!!.lowercase())

        // Levanta una exepción en la compilación porque desde antes se sabe que es null
        // stringVar = null
        // println(stringVar!!.lowercase())

        // Levanta una exepción en la ejecución porque desde antes NO se sabe si es null
        fun returnNull(): String? {
            return null
        }

        stringVar = returnNull() // Asignamos null a la variable
        println(stringVar) // Imprime null
        // println(stringVar!!) // Error al castear null a no-null (java.lang.NullPointerException)

        println(stringVar?.lowercase()?: "texto2")

        // Podemos hacer una llamada segura con el signo ?, dado que si la variable que se evalúa
    }

    private fun functions() {
        /*
        Para crear una función usamos la palabra reservada fun
         */

        fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
            return firstNumber + secondNumber
        }

        println(sumTwoNumbers(1,2))
    }

    private fun classes() {

        val sergio = User("Sergio", 27, arrayOf("Python", "Kotlin"))
        println(sergio.name)
    }

    enum class Direction (val dir: Int) {
        /*
        Podemos agregar los elementos que queremos que sean las opciones disponibles de nuestro
        enumerado. Después se puede obtener el string o el índice de la opción seleccionada.

        También podemos agregar funciones escribiendo ";" después de la última opción del enumerado.

        También podemos agregar un argumento que se aplicaría a cada una de las opciones del
        enum, para esto solamente basta con agregar los argumentos en paréntesis en la definición
        de la clase, y luego en cada una de las opciones del enum.
         */
        NORTH(1),
        SOUTH(-1),
        EAST(1),
        WEST(-1);

        fun description() {
            var msg: String = "La dirección es "
            when (this) {
                NORTH -> {
                    msg += "NORTE"
                }
                SOUTH -> {
                    msg += "SUR"
                }
                EAST -> {
                    msg += "ESTE"
                }
                WEST -> {
                    msg += "OESTE"
                }
                else -> {
                    println("Ninguna")
                }
            }
            println(msg)
        }
    }

    private fun enumClasses() {
        var userDirection: Direction? = null

        userDirection = Direction.EAST

        println(userDirection)
        println(userDirection.name) // Valor del string
        println(userDirection.ordinal) // Valor del índice

        userDirection.description()

        println("La dirección es: ${userDirection.dir}")
    }



    private fun nestedAndInnerClasses() {

        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        println(myNestedClass.sum(1,2))

        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        println(myInnerClass.sumOne(1))
    }



    private fun interfaces() {
        /*
        Las interfaces nos permiten definir una serie de atributos y propiedades que deben ser
        implementados en las clases que las hereden (Extiendan)
         */

        // Esto es incorrecto porque la interfaz no almacena nada, debe ser a través de una clase
        // val game = Game().stream()

//        val person: Person = Person("Sergio", 27)
        val person: Person = Person("Sergio", 27, "Among Us")

        person.work() // Método de la clase person
        person.goToWork() // Heredado de clase abstracta Work
        person.play() // Heredado de interfaz Game
        person.stream() // Heredado de interfaz Game
    }

    private fun visibilityModifiers() {
        /*
        Las clases, instancias, interfaces, funciones y atributos pueden tener limitaciones en
        el acceso con los modificadores de visibilidad

        - private -> Permite el acceso solamente desde donde se define

        - protected -> Permite acceder a los métodos y atributos de la clase padre, pero no
                        desde alguna instancia (Es casi como un private)

        - internal -> Permite visibilidad desde cualquier parte del módulo (En este caso app)

        - public -> Es el valor por defecto, permite que se pueda acceder desde cualquier sitio.
         */


        /*
        No podemos instanciar la clase, ni acceder a sus atributos o métodos porque están definidos
        como privados y están en un fichero diferente a donde se definieron.
         */
        // val privateVisibility = PrivateVisibility()
        // privateVisibility.name = "Sergio"
        // privateVisibility.sayMyName()

        /*
        Si se puede instancias la clase, porque está como pública, pero no se puede ejecutar
        el método porque está como protected, por lo que solamente se podría ejecutar desde una
        subclase
         */
        val visibility2 = VisibilityTwo()
        // visibility2.sayMyName2()

        /*
        Podemos instanciar la clase y acceder al atributo porque estamos en el mismo módulo
         */
        val visibility3 = Visibility3()
        visibility3.sayMyName3()
        visibility3.age

    }

    private fun dataClasses() {
        /*
        Clases que principalmente se utilizan para almacenar información.
         */

        val sergio = Worker("Sergio", 27, "Programador")
        sergio.lastWork = "CSR"
        println(sergio.lastWork)

        val mafe = Worker()

        val andres = Worker("Sergio", 27, "Programador")
        sergio.lastWork = "CSR"


        // equals -> Compara dos data classes- Se puede reemplazar por ==
//        if (sergio.equals(mafe)) { // -> No
//        if (sergio == mafe) { // -> No
        if (sergio == andres) { // -> Si
            println("Son iguales")
        } else {
            println("No son iguales")
        }

        // toString -> Crea una representación en string del data Class
        println(sergio.toString())

        // copy -> Crea una copia de un objeto, se pueden modificar los atributos
        val sergio2 = sergio.copy(age = 28)
        println(sergio.toString())
        println(sergio2.toString())

        // componentN -> Descomponemos el objeto en sus atributos (ordenados)
        val (name, age) = sergio // Igual a name = sergio.name y age = sergio.age
        println(name)
        println(age)
    }


    private var myMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()
    private fun typeAliases() {
        /*
        Se usan para que sea más sencillo ...

        En este caso tenemos una variable myMap con un tipo relativamente complejo, si queremos
        usar otras variables que tengan ese mismo tipo de dato tendríamos que especificarlo cada
        vez.
        En este caso creamos myNewMap del mismo tipo que myMap, le asignamos algunos valores, y
        reasignamos el valor de myMap.
         */
        var myNewMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()
        myNewMap[1] = arrayListOf("Sergio", "Andres")
        myNewMap[2] = arrayListOf("Sergio2", "Andres2")

        myMap = myNewMap

        /*
        Para evitarlo podemos crear alias para los tipos de datos al inicio del documento, justo
        antes de la definición de la clase, usamos la palabra reservada typealias y el nombre del
        tipo
         */
        var myNewNewMap: MyMapList = mutableMapOf(
            1 to arrayListOf("Sergio", "Andres"),
            2 to arrayListOf("Sergio2", "Andres2"),
        )

    }


    private fun destructuringDeclarations() {
        /*
        Sirve para extraer la información de manera más limpia.

        Permite crear varias variables de una sola vez, usando los atributos de una clase.

        La desestructuración ocurre en el orden en que estén definidos los atributos de la clase,
        y pueden agregarse a medida que se vayan necesitando.
         */
        val sergio = Worker("Sergio", 27, "Programador")

        val (name) = sergio // Solamente se extrae el nombre
        println(name)

        val (name2, age2) = sergio // Se extraen los primeros dos atributos
        println("$name2, $age2")

        val (name3, age3, work3) = sergio // Se extraen los 3 atributos
        println("$name3, $age3, $work3")

        // También se puede hacer desestructuración usando el método component()
        println(sergio.component1())
        println(sergio.component2())
        println(sergio.component3())

        // También se puede hacer sobre el retorno de una función
        fun myWorker(): Worker {
            return Worker("Sergio", 27, "Programador")
        }

        val (name4, age4, work4) = myWorker()
        println("$name4, $age4, $work4")

        // También se puede aplicar la destructuración en los maps
        val myMap = mapOf(1 to "Sergio", 2 to "Sergio2", 3 to "Sergio3")
        for ((key, value) in myMap) {
            println("Key: $key, value: $value")
        }

        // Se puede usar el _ para ignorar una propiedad (Como en python)
        val (name5, _, work5) = sergio // Se extraen los 3 atributos
        println("$name5, $work5")
    }


    private fun extensions() {
        /*
        Las extensiones son funcionalidades (funciones o atributos) que se le pueden agregar a
        clases o módulos ya creados sin tener que modificar el código fuente.

        Los modificadores de acceso aplican de igual manera.
         */

        val myDate = Date()
        println(myDate.customFormat())
        println(myDate.formatSize)

        var myDateNullabe: Date? = null
        println(myDateNullabe?.customFormat())
        println(myDateNullabe?.formatSize)
    }


    private fun lambdas() {
        /*
        Permite definir funciones que pueden trabajar sobre otras funciones

        En este caso filter es una función que itera por cada uno de los elementos de una lista y
        que requiere que otra función evalúe los valores para ver si cumple una condición

        En este caso se evalúa que cada valor sea mayor a 5
         */
        val myIntList = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)

        // Podemos reemplazar el valor por defecto que toma cada elemento con un ->
        // val newList = myIntList.filter { myInt ->
        val newList = myIntList.filter {
            /*
            Acá podríamos agregar más código. Por ejemplo si además de tener en cuenta los valores
            que son mayores a 5 queremos incluir el 1, hacemos un return@FUNCION
             */
            if (it == 1) {
                return@filter true
            }

            it > 5 // No hace falta poner el return, ya lo toma por defecto
        }

        // println(newList) // -> [6, 7, 8, 9, 10]
        println(newList) // -> [1, 6, 7, 8, 9, 10]

        // Crear lamba personalizada
        val mySumFun = fun (x: Int, y: Int): Int {
            return x + y
        }

        // Crear lamba personalizada en una sola línea
        val mySumFun2 = fun (x: Int, y: Int): Int = x + y
        val myMulFun = fun (x: Int, y: Int): Int = x * y

        println(mySumFun(1,2))
        println(mySumFun2(1,2))
        println(myMulFun(1,2))

        println(myOperateFun(5, 10, mySumFun))
        println(myOperateFun(5, 10, myMulFun))
    }

    /*
     Para indicar que una función recibe otra función de argumento debemos especificarlo indicando
     el nombre que tendrá la función recibida y los tipos de datos que recibe y retorna

     En este caso el argumento se llama myFun, recibe 2 enteros y returna otro entero
     Luego esta función es utilizada dentro de la función general.
     */
    private fun myOperateFun(x: Int, y: Int, myFun: (Int, Int) -> Int) : Int {
        return myFun(x, y)
    }
}

