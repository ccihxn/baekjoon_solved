
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

private var linked = arrayOf(ArrayList<Int>())
private var isVisited = booleanArrayOf()
private val result = TreeMap<Int, Int>();
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    linked = Array(n + 1) { ArrayList() }
    isVisited = BooleanArray(n + 1);
    repeat(n - 1) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        linked[x].add(y)
        linked[y].add(x)
    }
    result[1] = 0
    dfs(1)
    result.remove(1)
    result.forEach{ key, value -> w.appendLine(value.toString()) }
    w.close()
}

private fun dfs(n : Int) {
    if (isVisited[n]) return
    isVisited[n] = true
    linked[n].forEach{
        if (result.containsKey(it)) result.put(n, it)
        else result.put(it, n)
        dfs(it)
    }
}