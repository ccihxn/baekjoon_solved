import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val m = r.readLine().toInt()
    val n = r.readLine().toInt()
    val primes = mutableListOf<Int>()
    for (i in m..n) {
        if (i == 1) continue
        val sqrt = sqrt(i.toDouble()).toInt()
        var isPrime = true
        for (j in 2..sqrt) if (i % j == 0) {
            isPrime = false
            break
        }
        if (isPrime) primes.add(i)
    }
    if (primes.size == 0) w.write("-1")
    else {
        w.write(primes.sum().toString() + "\n")
        w.write(primes.min().toString())
    }
    w.close()
}