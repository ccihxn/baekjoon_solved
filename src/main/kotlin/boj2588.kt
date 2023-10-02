import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.Writer
import java.time.temporal.ValueRange

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val a = r.readLine().toInt()
    var b = r.readLine().toInt()
    var c = b
    w.write((a * (b % 10)).toString() + "\n")
    b /= 10
    w.write((a * (b % 10)).toString() + "\n")
    b /= 10
    w.write((a * b).toString() + "\n")
    w.write((a * c).toString())
    w.close()
}