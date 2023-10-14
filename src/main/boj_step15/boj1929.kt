
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (m, n) = r.readLine().split(" ").map { it.toInt() }
    for (i in m .. n) {
        if(i.toBigInteger().isProbablePrime(10)) w.write("$i\n")
    }
    w.close()
}