import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var list = mutableSetOf<String>()
    repeat(n) {
        list.add(r.readLine())
    }
    list = list.sortedWith(compareBy<String> { it.length }.thenBy { it }).toMutableSet()
    list.forEach {
        w.write(it)
        w.newLine()
    }
    w.close()
}