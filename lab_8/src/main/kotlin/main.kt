import java.util.*
import java.util.Objects




fun main(args: Array<String>) {
    pyatChislo(Objects.requireNonNull(readLine().toString()))
    register(Objects.requireNonNull(readLine().toString()))
    sred(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
}

private fun pyatChislo(arg: String) {
    val chars = arg.toCharArray()
    println(chars)
}

private fun register(chars: String) {
    println(chars.uppercase(Locale.getDefault()))
}

private fun sred(mas: IntArray) {
    var sum = 0
    for (i in mas.indices) sum += mas[i]
    println(sum / mas.size)
}