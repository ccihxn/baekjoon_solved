import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val dial = intArrayOf(3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10)
    val s = r.readLine()!!
    var time = 0
    for (i in 0 until s.length)
        time += dial[s.get(i) - 'A']
    w.write(time.toString())
    w.close()
}