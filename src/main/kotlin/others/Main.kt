import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val list = ArrayList<Pair<Int, Int>>()
    repeat(r.readLine().toInt()) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        list.add(Pair(x, y))
    }
    list.sortWith (compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })
    list.forEach { w.appendLine("${it.first} ${it.second}") }
    w.close()
}