import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = r.readLine().split(" ").map { it.toInt() }
    val result = if(a > b) ">" else if(a < b) "<" else "=="
    w.write(result)
    w.close()
}