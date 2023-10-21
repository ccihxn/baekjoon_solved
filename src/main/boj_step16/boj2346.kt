
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val tmp = r.readLine().split(" ").map { it.toInt() }
    val balloons = LinkedList<Int>()
    val balloonIdx = LinkedList<Int>()
    var node = 1
    tmp.forEach { balloons.add(it) }
    for (i in 1 .. n) balloonIdx.add(i)
    repeat(balloons.size) {
        if (node < 0) node += balloons.size
        if (node >= balloons.size) node %= balloons.size
        else {
            w.write("${balloonIdx[node]} ")
            node += balloons.removeAt(node)
        }
    }
    w.close()
}