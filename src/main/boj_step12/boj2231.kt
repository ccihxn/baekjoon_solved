import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import javax.swing.RepaintManager

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w =BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    repeat(n) {
        val c = it.toString().toCharArray()
        var sum = it
        c.forEach {
            sum += it - '0'
        }
        if (sum == n) {
            w.write(it.toString())
            w.close()
            return
        }
    }
    w.write("0")
    w.close()
}