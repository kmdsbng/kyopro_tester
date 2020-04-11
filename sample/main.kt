package f

fun main(args: Array<String>) {
    val line = readLine()!!.trim()
    val n = line.toInt()
    val line2 = readLine()!!.trim()
    var arys: List<Long> = line2.split(" ").map {it.toLong()}.take(n)

    var count = 0

    while (true) {
        if (canCalc(arys)) {
            arys = calc(arys)
            count += 1
        } else {
            break
        }
    }

    println("${count}")

}

fun calc(arys: List<Long>): List<Long> {
    return arys.map {it / 2}
}

fun canCalc(arys: List<Long>): Boolean {
    return arys.all {it % 2L == 0L}
}


