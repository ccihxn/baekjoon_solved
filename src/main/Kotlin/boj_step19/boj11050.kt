import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var (n, k) = r.readLine().split(" ").map { it.toInt() }
    var nfact = 1
    var kfact = 1
    for (i in n - k + 1 .. n) nfact *= i
    for (i in 1 .. k) kfact *= i
    w.write("${nfact / kfact}")
    w.close()
}