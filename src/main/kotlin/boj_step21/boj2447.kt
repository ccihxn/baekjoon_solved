import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var starArray = arrayOf(charArrayOf());
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    starArray = Array(n) { CharArray(n) }
    stars(0, 0, n, false)
    repeat(n) { i ->
        repeat(n) { j -> w.append(starArray[i][j].toString()) }
        w.newLine()
    }
    w.close()
}

private fun stars(x: Int, y:Int, n: Int, isBlanked: Boolean) {
    if (isBlanked) {
        for (i in x until x + n)
            for (j in y until y + n) starArray[i][j] = ' '
        return
    }
    if (n == 1) {
        starArray[x][y] = '*'
        return
    }
    val size = n / 3
    var count = 0
    for (i in x until x + n step (size))
        for (j in y until y + n step (size)) {
            count++
            if (count == 5) stars(i, j, size, true);
            else stars(i, j, size, false)
        }
}