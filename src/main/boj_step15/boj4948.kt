import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
        val r = BufferedReader(InputStreamReader(System.`in`))
        val w = BufferedWriter(OutputStreamWriter(System.out))
        val maxN = 250000
        var primes = Array(maxN + 1) { true }
        for (i in 2..maxN / 2) {
                if (!primes[i]) continue
                for (j in i * 2..maxN step i) primes[j] = false
        }
        while (true) {
                val k = r.readLine().toInt()
                if (k == 0) break
                var ans = 0
                for (i in k + 1..k * 2) if (primes[i]) ans++
                w.write(ans.toString())
                w.newLine()
        }
        w.close()
}
