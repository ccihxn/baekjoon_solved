
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.stream.IntStream

private var linked = arrayOf(ArrayList<Int>())
private var isVisited = booleanArrayOf()
private var check = intArrayOf()
private var isBipartite = true
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val k = r.readLine().toInt()
    repeat(k) {
        isBipartite = true
        val (v, e) = r.readLine().split(" ").map { it.toInt() }
        linked = Array(v + 1) { ArrayList() }
        isVisited = BooleanArray(v + 1)
        check = IntArray(v + 1)
        repeat(e) {
            val (x, y) = r.readLine().split(" ").map { it.toInt() }
            linked[x].add(y)
            linked[y].add(x)
        }
        IntStream.range(1, v + 1).forEach {
            if (isBipartite) dfs(it)
            else return@forEach
        }
        w.appendLine(if (isBipartite) "YES" else "NO")
    }
    w.close()
}

private fun dfs(n: Int) {
    isVisited[n] = true
    linked[n].forEach {
        if (!isVisited[it]) {
            check[it] = (check[n] + 1) % 2
            dfs(it)
        } else if (check[n] == check[it]) isBipartite = false
    }
}