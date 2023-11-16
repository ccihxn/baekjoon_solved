import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val list = mutableListOf<Int>()
    val count = IntArray(8001)
    repeat(n) { list.add(r.readLine().toInt()) }
    list.forEach { count[it + 4000]++ }
    if ( count.count { it == count.maxOrNull() } >= 2) count[count.indexOf(count.maxOrNull()!!)]--
    list.sort()
    w.appendLine("${(list.sum().toDouble() / list.size).roundToInt()}")
    w.appendLine("${list.elementAt(n / 2)}")
    w.appendLine("${count.indexOf(count.maxOrNull()!!) - 4000}")
    w.appendLine("${list.last() - list.first()}")
    w.close()
}