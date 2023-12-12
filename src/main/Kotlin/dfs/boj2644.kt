
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import java.util.stream.IntStream

private var linked = arrayOf(ArrayList<Int>())
private var isVisited = booleanArrayOf()
private var count = 0
private val b = StringBuilder()
private var personA = 0
private var personB = 0
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    linked = Array(n + 1) { ArrayList() }
    IntStream.range(1, n + 1).forEach { linked[it] = ArrayList() }
    isVisited = BooleanArray(n + 1)
    val t = StringTokenizer(r.readLine())
    personA = t.nextToken().toInt()
    personB = t.nextToken().toInt()
    repeat(r.readLine().toInt()) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        linked[x].add(y)
        linked[y].add(x)
    }
    dfs(personA)
    if (b.isEmpty()) w.append("-1").close()
    else w.append(b).close()
}
private fun dfs(people: Int) {
    if (isVisited[people]) return
    isVisited[people] = true
    if (people == personB) b.append(count)
    count++
    linked[people].forEach { nextPeople -> dfs(nextPeople) }
    count--
}