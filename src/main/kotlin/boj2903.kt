import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.temporal.ValueRange

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = r.readLine().toInt()
    n += 1
    var dots = 0
    var tmp = 2
    repeat(n) {
        dots = tmp * tmp
        tmp *= 2
        tmp -= 1
    }
    w.write(dots.toString())
    w.close()
}