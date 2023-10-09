import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.temporal.ValueRange

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine()
    val c = n.toCharArray()
    val nArray = IntArray(c.size)
    c.forEachIndexed { index, it ->
        nArray[index] = it - '0'
    }
    nArray.sort()
    nArray.reverse()
    nArray.forEach { w.write(it.toString()) }
    w.close()
}