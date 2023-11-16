import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b, c) = r.readLine().split(" ").map { it.toInt() }
    if(a == b && a == c) w.write((10000 + a * 1000).toString())
    else if(a == b || a == c) w.write((1000 + a * 100).toString())
    else if(b == c) w.write((1000 + b * 100).toString())
    else w.write((max(max(a, b), c) * 100).toString())
    w.close()
}