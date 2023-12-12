
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import java.util.stream.IntStream

private var n = 0
private var m = 0
private var isVisited = booleanArrayOf()
private val result = Stack<Int>()
private val b = StringBuilder()
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val t = StringTokenizer(r.readLine())
    n = t.nextToken().toInt()
    m = t.nextToken().toInt()
    isVisited = BooleanArray(n + 1)
    dfs(0)
    w.append(b).close()
}
private fun dfs(tmp: Int) {
    if (tmp == m) {
        result.forEach { b.append("$it ") }
        b.append('\n')
        return
    }
    IntStream.range(1, n + 1).forEach {
        result.push(it)
        dfs(tmp + 1)
    }
}