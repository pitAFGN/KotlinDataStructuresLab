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