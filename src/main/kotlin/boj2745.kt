import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, b) = r.readLine().split(" ").map { it }
    w.write(n.toBigInteger(b.toInt()).toString())
    w.close()
}