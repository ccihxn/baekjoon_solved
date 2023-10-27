import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a1, a0) = r.readLine().split(" ").map { it.toLong() }
    val c = r.readLine().toLong()
    val a = r.readLine().toLong()
    w.write((a1 * a + a0 <= c * a && c >= a1).compareTo(false).toString())
    w.close()
}