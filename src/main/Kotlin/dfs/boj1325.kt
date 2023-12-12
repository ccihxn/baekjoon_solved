import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.stream.IntStream

private var roots = ArrayList<Int>()
private var reverseLinked = arrayOf(ArrayList<Int>())
private var linked = arrayOf(ArrayList<Int>())
private var visited = booleanArrayOf()
private var count = 1
private var counts = HashMap<Int, Int>()
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = r.readLine().split(" ").map { it.toInt() }
    linked = Array(n + 1) { ArrayList() }
    reverseLinked = Array(n + 1) { ArrayList() }
    IntStream.range(1, n + 1).forEach { linked[it] = ArrayList() }
    IntStream.range(1, n + 1).forEach { reverseLinked[it] = ArrayList() }
    visited = BooleanArray(n + 1)
    repeat(k) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        reverseLinked[x].add(y)
        linked[y].add(x)
    }
    IntStream.range(1, n + 1).forEach {
        reverseDfs(it)
    }
    roots.forEach {
        count = 0
        visited.fill(false)
        dfs(it)
        counts[it] = count
    }
//    w.appendLine(roots.joinToString())
    val maxCount = counts.maxByOrNull { it.value }?.value
    counts.filter { it.value == maxCount }.keys.forEach {
        w.append("$it ")
    }
    w.close()
}

private fun dfs(n: Int) {
//    if (visited[n]) return
//    visited[n] = true
//    count++
//    linked[n].forEach{ dfs(it) }
    linked[n].forEach {
        if (!visited[it]) {
            visited[it] = true
            count++
            dfs(it)
        }
    }
}

private fun reverseDfs(n: Int) {
    reverseLinked[n].forEach {
            if (reverseLinked[it].isEmpty())
                roots.add(it)
    }
}