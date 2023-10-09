import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class boj1934 {
    fun main() {
        val r = BufferedReader(InputStreamReader(System.`in`))
        val w = BufferedWriter(OutputStreamWriter(System.out))
        val n = r.readLine().toInt()
        repeat(n) {
            val (a, b) = r.readLine().split(" ").map { it.toInt() }
            w.write(((a * b) / gcd(a, b)).toString())
            w.newLine()
        }
        w.close()
    }

    private fun gcd(a: Int, b: Int): Int = if(b != 0) gcd(b, a % b) else a
}