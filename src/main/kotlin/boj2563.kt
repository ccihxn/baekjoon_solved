import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var result = 0
    val square = Array(100) { BooleanArray(100) }
    repeat(n) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        for (i in y until y + 10)
            for (j in x until x + 10) {
                if(square[i][j]) continue
                square[i][j] = true
                result++
            }
    }
    w.write(result.toString())
    w.close()
}