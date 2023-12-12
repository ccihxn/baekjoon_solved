import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.stream.IntStream

private var linked = arrayOf(ArrayList<Int>())
private var isInfected = booleanArrayOf()
private var count = 0
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val k = r.readLine().toInt()
    linked = Array(n + 1) { ArrayList() }
    IntStream.range(1, n + 1).forEach { linked[it] = ArrayList() }
    isInfected = BooleanArray(n + 1)
    repeat(k) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        linked[x].add(y)
        linked[y].add(x)
    }
    infect(1)
    w.append(linked[5].toString()).append('\n');
    w.append((count - 1).toString()).close()
}

private fun infect(n: Int) {
    if (isInfected[n]) return
    isInfected[n] = true
    count++
    linked[n].forEach{ infect(it) }
}