import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = r.readLine()!!.toInt()
    val arr = r.readLine()!!.split(" ").map { it.toInt() }
    val v = r.readLine()!!.toInt()
    var cnt = 0
    for (i in 0 until n) if(arr[i] == v) cnt ++
    w.write(cnt.toString())
    w.close()
}