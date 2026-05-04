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