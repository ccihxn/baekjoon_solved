
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (min, max) = r.readLine().split(" ").map { it.toLong() }
    var count = 0
    while (min <= max) {
        if (sqrt(min.toDouble()) != sqrt(min.toDouble()).toLong().toDouble()) count++
        min++
    }
    w.append(count.toString()).close()
}