
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

private var n = 0
private var m = 0
private val result = Stack<Int>()
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val t = StringTokenizer(r.readLine())
    n = t.nextToken().toInt()
    m = t.nextToken().toInt()
    val b = StringBuilder()
    dfs(1, 0, b)
    w.append(b).close()
}
private fun dfs(tmp: Int, num: Int, b: StringBuilder) {
    if (num == m) {
        result.forEach { b.append(it).append(' ') }
        b.appendLine()
        return
    }
    for (i in tmp .. n) {
        result.push(i)
        dfs(i, num + 1, b)
        result.pop()
    }
}