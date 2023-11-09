import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = r.readLine().split(" ").map { it.toInt() }
    val list = r.readLine().split(" ").map { it.toInt() }.toIntArray()
    var count = 0
    var temp = 0
    for (i in 0 until list.size - 1) {
        for (j in i until list.size - 1) {
            val sorter = Pair(list[j], list[j + 1])
            if (sorter.first > sorter.second) {
                list[j] = sorter.second
                list[j + 1 ] = sorter.first
            }
        }
        w.appendLine(list.joinToString())
    }
    w.append(list.joinToString())
    w.close()
}