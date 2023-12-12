import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = r.readLine().split(" ").map { it.toInt() }
    val factors = mutableListOf<Int>()
    repeat(n) {
        if (n % (it + 1) == 0) factors.add(it + 1)
    }
    if(k > factors.size) w.write("0")
    else w.write(factors[k - 1].toString())
    w.close()
}