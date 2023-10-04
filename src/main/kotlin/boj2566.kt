import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var y = 0
    var x = 0
    var max = 0
    repeat(9) {
        val arr = r.readLine().split(" ").map { it.toInt() }
        arr.forEachIndexed { index, n ->
            if(max <= n) {
                y = it + 1
                x = index + 1
                max = n
            }
        }
    }
    w.write("$max\n$y $x")
    w.close()
}