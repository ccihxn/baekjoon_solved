import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    repeat(n) {
        var (n, m) = r.readLine().split(" ").map { it.toInt() }
        var mfact = BigInteger.valueOf(1)
        var nfact = BigInteger.valueOf(1)
        if (n > m / 2) n = m - n
        for (i in m - n + 1 .. m) mfact *= i.toBigInteger()
        for (i in 1 .. n) nfact *= i.toBigInteger()
        w.appendLine("${mfact / nfact}")
    }
    w.close()
}