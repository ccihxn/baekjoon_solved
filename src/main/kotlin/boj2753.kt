import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.Year

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val year = r.readLine()!!.toInt()
    w.write(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0).compareTo(false).toString())
    w.close()
}