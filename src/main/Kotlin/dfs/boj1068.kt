
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

private var linked = arrayOf(ArrayList<Int>())
private var count = 0
private var rootNode = 0
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    linked = Array(r.readLine().toInt()) { ArrayList() }
    val t = StringTokenizer(r.readLine())
    repeat(t.countTokens()) {
        val tmp = t.nextToken().toInt()
        if (tmp == -1) rootNode = it
        else linked[tmp].add(it)
    }
    val removeKey = r.readLine().toInt()
    if (removeKey == rootNode) w.append("0").close()
    else {
        linked.indices.forEach { if (linked[it].contains(removeKey)) linked[it] = linked[it].filter { it != removeKey } as ArrayList<Int> }
        if (linked[rootNode].isEmpty()) w.append("1").close()
        else {
            dfs(rootNode)
            w.append(count.toString()).close()
        }
    }
}

private fun dfs(n: Int) {
    linked[n].forEach {
        if (linked[it].isEmpty()) count++
        else dfs(it)
    }
}