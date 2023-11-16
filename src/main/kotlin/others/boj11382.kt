import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b, c) = r.readLine().split(" ").map { it.toBigInteger() }
    w.write((a + b + c).toString())
    w.close()
}