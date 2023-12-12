import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()
    repeat(3) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        xList.add(x)
        yList.add(y)
    }
    val x = if(xList[0] == xList[1]) xList[2] else if (xList[0] == xList[2]) xList[1] else xList[0]
    val y = if(yList[0] == yList[1]) yList[2] else if (yList[0] == yList[2]) yList[1] else yList[0]
    w.write("$x $y")
    w.close()
}