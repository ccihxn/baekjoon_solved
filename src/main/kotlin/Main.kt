import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    r.readLine().toInt()
    val factors = r.readLine().split(" ").map { it.toInt() }.sorted()
    w.write("${factors.first() * factors.last()}")
    w.close()
}