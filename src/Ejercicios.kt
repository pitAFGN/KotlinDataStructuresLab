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

fun organizarMaleta() {
    val lista = listOf("Ropa" to 2, "Zapatos" to 1)
    val mapa = mutableMapOf<Int, MutableList<String>>()

    for (obj in lista) {
        mapa.getOrPut(obj.second) { mutableListOf() }.add(obj.first)
    }

    println(mapa)
}

fun rutaEspejo() {
    val lista = listOf(1, 2, 3, 2, 1)
    var ok = true

    for (i in 0 until lista.size / 2) {
        if (lista[i] != lista[lista.size - 1 - i]) ok = false
    }

    println(ok)
}

fun repartoPedidos() {
    val listaPaquetes = (1..50).toList().map { "Paquete #$it" }
    val grupos = listaPaquetes.chunked(10)

    println("\n--- Reparto de Pedidos ---")
    grupos.forEachIndexed { indice, grupo ->
        println("Camión ${indice + 1}: ${grupo.size} paquetes")
    }
}

fun ticketUnico() {
    val listaTickets = listOf("ERR-01", "ERR-02", "ERR-01", "ERR-03", "ERR-02", "ERR-04")
    val conteoTickets = listaTickets.groupingBy { it }.eachCount()
    val TicketUnico = listaTickets.firstOrNull { conteoTickets[it] == 2 }

    println("ticket único: $TicketUnico")
}

fun calcularIVA() {
    val listaProductos = mapOf("Arroz" to 3000.0, "Carne" to 80000.0, "Vino" to 100000.0, "Sal" to 2500.0)
    val preciosFinales = listaProductos.mapValues { (_, valor) ->
        if (valor > 50000) valor * 1.19 else valor
    }

    println("Precio con IVA: $preciosFinales")
}

fun mantenimientoSensores() {
    val listaSensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    listaSensores.removeAll { it % 3 == 0 }

    println("Sensores funcionales: $listaSensores")
}

fun analisisMatrizAlmacen() {
    val matriz = arrayOf(
        arrayOf(8, 4, 2, 5),
        arrayOf(5, 12, 4, 2),
        arrayOf(1, 3, 15, 3),
        arrayOf(12, 0, 4, 22)
    )
    var sumaPrincipal = 0
    var sumaSecundaria = 0
    val tamaño = matriz.size
    for (i in 0 until tamaño) {
        sumaPrincipal += matriz[i][i]
        sumaSecundaria += matriz[i][tamaño - 1 - i]
    }

    println("Suma Principal: $sumaPrincipal, Suma Secundaria: $sumaSecundaria")
}

fun fusionRecetas() {
    val recetaChef1 = mapOf("Sal" to 10.0, "Pimienta" to 5.0, "Carne" to 1000.0)
    val recetaChef2 = mapOf("Leche" to 5.0, "Azúcar" to 100.0, "Harina" to 200.0)

    val listaCompras = (recetaChef1.keys + recetaChef2.keys).associateWith {
        (recetaChef1[it] ?: 0.0) + (recetaChef2[it] ?: 0.0)
    }

    println("Lista de compras: $listaCompras")
}

fun rankingApps() {
    val listaApps = mutableListOf("App 1" to 3.5, "App 2" to 4.8, "App 3" to 3.9)
    for (i in 0 until listaApps.size - 1) {
        for (j in 0 until listaApps.size - 1 - i) {
            if (listaApps[j].second < listaApps[j + 1].second) {
                val temp = listaApps[j]
                listaApps[j] = listaApps[j + 1]
                listaApps[j + 1] = temp
            }
        }
    }

    println("Top Apps: $listaApps")
}

fun fusionAgendas() {
    val lista1 = listOf("Pipe", "Andres", "Felipe")
    val lista2 = listOf("Carlos", "Jhonny", "Fabio")

    val resultado = mutableListOf<String>()
    var indice1 = 0
    var indice2 = 0

    while (indice1 < lista1.size && indice2 < lista2.size) {
        if (lista1[indice1] < lista2[indice2]) {
            resultado.add(lista1[indice1++])
        } else {
            resultado.add(lista2[indice2++])
        }
    }
    while (indice1 < lista1.size) resultado.add(lista1[indice1++])
    while (indice2 < lista2.size) resultado.add(lista2[indice2++])

    println("Agenda Fusionada: $resultado")
}

fun calcularNumerosPrimos() {
    val limite = 200
    val arregloPrimos = BooleanArray(limite + 1) { true }
    arregloPrimos[0] = false
    arregloPrimos[1] = false
    for (p in 2..Math.sqrt(limite.toDouble()).toInt()) {
        if (arregloPrimos[p]) {
            for (i in p * p..limite step p) arregloPrimos[i] = false
        }
    }
    val listaPrimos = (1..limite).filter { arregloPrimos[it] }

    println("Pisos con mantenimiento: $listaPrimos")
}

fun pilaPlatos() {
    val listaPila = mutableListOf<String>()
    fun agregar(plato: String) = listaPila.add(plato)
    fun quitar(): String? = if (listaPila.isNotEmpty()) listaPila.removeAt(listaPila.size - 1) else null

    agregar("Plato Seco")
    agregar("Plato Sopa")
    println("Lavandose: ${quitar()}")
    println("Pila restante: $listaPila")
}

fun seguimientoCalorias() {
    val listaCalorias = listOf(4000.0, 4200.0, 4800.0, 3100.0, 4500.0)
    val listaDiferencias = mutableListOf<Double>()
    var acumulado = 0.0

    for (i in listaCalorias.indices) {
        if (i == 0) {
            listaDiferencias.add(0.0)
        } else {
            val promedioAnterior = acumulado / i
            listaDiferencias.add(listaCalorias[i] - promedioAnterior)
        }
        acumulado += listaCalorias[i]
    }

    println("Diferencias vs Promedio Anterior: $listaDiferencias")
}

fun validarParentesis() {
    val cadena = "(()(())())"
    var contador = 0
    var esCorrecto = true
    for (caracter in cadena) {
        if (caracter == '(') contador++
        else if (caracter == ')') contador--
        if (contador < 0) {
            esCorrecto = false
            break
        }
    }
    if (contador != 0) esCorrecto = false

    println("Manifiesto: $cadena - ¿Válido?: $esCorrecto")
}

fun rendimientoMaraton() {
    val listaTiempos = mutableListOf(120.0, 115.0, 140.0, 110.0, 130.0)
    listaTiempos.sort()
    listaTiempos.removeAt(0)
    listaTiempos.removeAt(listaTiempos.size - 1)
    val promedioFinal = listaTiempos.average()

    println("\n--- Rendimiento Maratón ---")
    println("Promedio sin outliers: $promedioFinal")
}
