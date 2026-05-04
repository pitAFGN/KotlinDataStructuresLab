fun controlGastos() {
    val listaGastos = arrayOf(45.0, 10.5, 18.8, 20.5, 12.5)
    var sumaTotal = 0.0
    var gastoMax = listaGastos[0]
    var gastoMin = listaGastos[0]

    for (valor in listaGastos) {
        sumaTotal += valor
        if (valor > gastoMax) gastoMax = valor
        if (valor < gastoMin) gastoMin = valor
    }

    val promedio = sumaTotal / listaGastos.size

    println("Total: $sumaTotal, Promedio: $promedio, Máximo: $gastoMax, Mínimo: $gastoMin")
}

fun empleadosMayores() {
    val lista = listOf("Andres" to 25, "Emmanuel" to 30, "Sarah" to 40, "David" to 28, "Elena" to 31)

    val resultado = lista
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println(resultado)
}

fun limpiarContactos() {
    val numeros = listOf("300123", "311456", "300123", "320789", "311456", "350111", "300123")
    val resultado = numeros.toSet().sorted()

    println(resultado)
}

fun carritoCompras() {
    val productos = listOf("Leche", "Huevo", "Lechuga", "Tomate", "Pan", "Leche", "Café")
    val conteo = mutableMapOf<String, Int>()

    for (item in productos) {
        conteo[item] = conteo.getOrDefault(item, 0) + 1
    }

    println(conteo)
}

fun historialInvertido() {
    val paginas = arrayOf("google.com", "github.com", "pornhub.com", "xnxx.com", "MeVocatio.com")
    val reverso = arrayOfNulls<String>(paginas.size)

    for (i in paginas.indices) {
        reverso[i] = paginas[paginas.size - 1 - i]
    }

    println(paginas.joinToString())
    println(reverso.joinToString())
}

fun interesesCompartidos() {
    val gustos1 = setOf("Cine", "Música", "Viajes", "VideoJuegos")
    val gustos2 = setOf("Música", "Deportes", "Viajes", "Cocina")

    val comunes = gustos1.intersect(gustos2)
    val soloUno = gustos1.subtract(gustos2)

    println(comunes)
    println(soloUno)
}

fun inventario() {
    val almacen = mutableMapOf("Arroz" to 6, "Avena" to 2, "Papas" to 1)

    fun usar(nombre: String, cantidad: Int) {
        val actual = almacen[nombre] ?: 0
        val nuevo = actual - cantidad

        if (nuevo <= 0) {
            almacen.remove(nombre)
        } else {
            almacen[nombre] = nuevo
        }
    }

    usar("Leche", 1)
    usar("Arroz", 2)

    println(almacen)
}

fun promedioNotas() {
    val listaNotas = listOf(4.0 to 0.2, 4.8 to 0.3, 3.0 to 0.5)
    var acumulado = 0.0

    for (par in listaNotas) {
        acumulado += par.first * par.second
    }

    println(acumulado)
}

fun codigosPaises() {
    val mapa = mapOf("Co" to "Colombia", "Pam" to "Panama", "Ar" to "Argentina", "Es" to "España")

    for ((clave, valor) in mapa) {
        println("$clave -> $valor")
    }
}

fun rotacionEmpleados() {
    val lista = listOf("Empleado 1", "Empleado 2", "Empleado 3", "Empleado 4",)
    val salto = 2
    val resultado = mutableListOf<String>()

    for (i in lista.indices) {
        resultado.add(lista[(i + salto) % lista.size])
    }

    println(resultado)
}