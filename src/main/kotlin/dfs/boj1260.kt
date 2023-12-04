
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import java.util.stream.IntStream

private var linked = arrayOf(ArrayList<Int>())
private var isVisited = booleanArrayOf()
private val queue = LinkedList<Int>()
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, v) = r.readLine().split(" ").map { it.toInt() }
    linked = Array(n + 1) { arrayListOf() }
    IntStream.range(1, n + 1).forEach { linked[it] = ArrayList() }
    isVisited = BooleanArray(n + 1)
    repeat (m) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        linked[x].add(y)
        linked[y].add(x)
    }
    linked.forEach { it.sort() }
//    if (!isVisited[v]) dfs(v)
//    IntStream.range(1, n + 1).forEach { if (!isVisited[it]) dfs(it) }
    dfs(v)
    IntStream.range(1, n + 1).forEach { isVisited[it] = false }
    queue.forEach { w.append("$it ") }
    w.newLine()
    queue.clear()
    bfs(v)
    queue.forEach { w.append("$it ") }
    w.close()
}

//private fun dfs(n: Int) {
//    if (isVisited[n]) return
//    isVisited[n] = true
//    queue.offer(n)
//    linked[n].forEach { dfs(it) }
//}

private fun dfs(n: Int) {
    if (isVisited[n]) return
    queue.offer(n)
    isVisited[n] = true
    linked[n].forEach { dfs(it) }
}
//private fun bfs(n: Int) {
//    isVisited[n] = true
//    linked[n].forEach { if(!isVisited[it]) queue.offer(it) }
//    linked[n].forEach { if (!isVisited[it]) bfs(it) }
//}

private fun bfs(n: Int) {
    val q: Queue<Int> = LinkedList()
    q.offer(n)
    queue.offer(n)
    isVisited[n] = true
    while (q.isNotEmpty()) {
        val c = q.poll()
        linked[c].forEach {
            if (!isVisited[it]) {
                q.offer(it)
                queue.offer(it)
                isVisited[it] = true
            }
        }
    }
}