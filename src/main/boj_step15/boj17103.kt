
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    repeat(n) {
        val partition = r.readLine().toInt()
        val primes = mutableListOf<Int>()
        var count = 0
        for (prime in 2 .. partition) {
            primes.add(prime)

        }
        primes.forEach {
            if (it  >= partition / 2 + 1) return@forEach
            if (primes.contains(partition - it)) {
                count++
                primes.set(primes.indexOf(it), 0)
            }
        }
        w.appendLine("$count")
    }
    w.close()
}