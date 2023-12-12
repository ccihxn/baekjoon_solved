import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.contracts.contract
import kotlin.math.sqrt

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val arr = r.readLine().split(" ").map { it.toInt() }
    var count = 0
    arr.forEach {
        if (it == 1) return@forEach
        val sqrt = sqrt(it.toDouble()).toInt()
        var isPrime = true
        for (i in 2 .. sqrt) if (it % i == 0) {
            isPrime = false
            break
        }
        if (isPrime) count++
    }
    w.write(count.toString())
    w.close()
}