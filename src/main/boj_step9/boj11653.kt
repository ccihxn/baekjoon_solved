import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = r.readLine().toInt()
    for (i in 2 .. n) {
        while (n % i == 0) {
            w.write("$i\n")
            n /= i
        }
        if(n < 2) break
    }
    w.close()
}