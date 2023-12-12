import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    val a = r.readLine().split(" ").map { it.toInt() }.toMutableSet()
    val b = r.readLine().split(" ").map { it.toInt() }.toMutableSet()
    w.write("${((a - b) + (b - a)).size}")
    w.close()
}