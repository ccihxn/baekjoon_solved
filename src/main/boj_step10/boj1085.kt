import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedWriter(OutputStreamWriter(System.out))) {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val (x, y, w, h) = r.readLine().split(" ").map { it.toInt() }
    var min = kotlin.math.min(x, y)
    min = kotlin.math.min(min, w - x)
    min = kotlin.math.min(min, h - y)
    write(min.toString())
    close()
}