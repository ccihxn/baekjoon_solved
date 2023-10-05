import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max
import kotlin.math.min

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var (minx, maxx, miny, maxy) = "0 0 0 0".split(" ").map { it.toInt() }
    repeat(n) {
        val (x, y) = r.readLine().split(" ").map { it.toInt() }
        if(it == 0) {
            minx = x
            maxx = x
            miny = y
            maxy = y
        }
        else {
            minx = min(minx, x)
            maxx = max(maxx, x)
            miny = min(miny, y)
            maxy = max(maxy, y)
        }
    }
    w.write(((maxx - minx) * (maxy - miny)).toString())
    w.close()
 }