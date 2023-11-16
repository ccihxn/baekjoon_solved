import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val balloons = ArrayList<Pair<Int, Int>> ()
    r.readLine().split(" ").map { it.toInt() }.forEachIndexed { index, it ->
        balloons.add(Pair(it, index + 1 ))
    }
    var idx = 0
    while(balloons.isNotEmpty()) {
        w.write("${balloons[idx].second} ")
        var temp = balloons[idx].first
        balloons.removeAt(idx)
        if (balloons.isEmpty()) break
        if (temp > 0) temp--
        idx += temp
        while (idx !in balloons.indices) {
            if (idx < 0) idx += balloons.size
            idx %= balloons.size
        }
    }
    w.close()
}