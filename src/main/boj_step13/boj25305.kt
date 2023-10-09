import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.concurrent.fixedRateTimer

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = r.readLine().split(" ").map { it.toInt() }
    var list = r.readLine().split(" ").map { it.toInt() }
    list = list.sorted()
    w.write(list[list.size - k].toString())
    w.close()
}