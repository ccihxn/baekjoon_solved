import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import javax.swing.ViewportLayout

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, x) = r.readLine()!!.split(" ").map { it.toInt() }
    val arr = r.readLine()!!.split(" ").map { it.toInt() }
    for(i in 0 until n) if(arr[i] < x) w.write("${arr[i]} ")
    w.close()
}