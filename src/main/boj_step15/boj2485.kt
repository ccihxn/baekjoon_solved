import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val trees = mutableListOf<Int>()
    var tmp = 10000000
    var count = 0
    repeat(n) { trees.add(r.readLine().toInt()) }
    trees.gcd
    w.write(count.toString() )
    w.close()
}

private fun gcd(a: Int, b: Int): Int = if(b != 0) gcd(b, a % b) else a