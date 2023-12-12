import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val isPrimes = BooleanArray(1_000_000) { true }
    isPrimes[0] = false
    isPrimes[1] = false
    for (i in 2 until isPrimes.size) {
        if (isPrimes[i] == false) continue
        for (j in i * 2 until isPrimes.size step (i)) isPrimes[j] = false
    }
    val primes = mutableListOf<Int>()
    isPrimes.forEachIndexed { index, it -> if (it) primes.add(index) }
    repeat(n) {
        val partition = r.readLine().toInt()
        var count = 0
        primes.forEach {
            if (it > partition / 2) return@forEach
            if (isPrimes[partition - it]) count++
        }
        w.appendLine(count.toString())
    }
    w.close()
}




