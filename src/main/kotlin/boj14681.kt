import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val x = r.readLine()!!.toInt()
    val y = r.readLine()!!.toInt()
    val result = if(x > 0 && y > 0) "1" else if(x < 0 && y > 0) "2" else if(x < 0 && y < 0) "3" else "4"
    w.write(result)
    w.close()
}