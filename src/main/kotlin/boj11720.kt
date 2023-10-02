import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()!!.toInt()
    val s = r.readLine()
    var sum = 0
    for(i in 0 until s.length) sum += s.get(i).toString().toInt()
    w.write(sum.toString())
    w.close()
}