import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.stream.IntStream

private var linked = arrayOf(ArrayList<Int>())
private var isVisited = booleanArrayOf()
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    var count = 0
    linked = Array(n + 1) { ArrayList() }
    IntStream.range(0, n).forEach { linked[it] = ArrayList() }
    isVisited = BooleanArray(n + 1)
    repeat(m) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        linked[x].add(y)
        linked[y].add(x)
    }
    repeat(n) {
        if (!isVisited[it + 1]) {
            count++
            dfs(it + 1)
        }
    }
    w.append(count.toString()).close()
}

private fun dfs(n: Int) {
    if (isVisited[n]) return
    isVisited[n] = true
    linked[n].forEach { if (!isVisited[it]) dfs(it) }
}
