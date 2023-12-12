import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.System

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val n = r.readLine().toInt()
        if (n == -1) {
            w.close()
            return
        }
        val factors = mutableListOf<Int>()
        for (i in 1..n / 2) if (n % i == 0) factors.add(i)
        if (factors.sum() == n) {
            w.write("$n = ")
            factors.forEachIndexed { index, it ->
                if (index == factors.size - 1) w.write("$it")
                else w.write("$it + ")
            }
        } else w.write("$n is NOT perfect.")
        w.write("\n")
    }
}