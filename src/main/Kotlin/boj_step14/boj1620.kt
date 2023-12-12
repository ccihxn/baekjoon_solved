import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.coroutines.CoroutineContext

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    val map = HashMap<String, String>()
    repeat(n) {
        val pocketmon = r.readLine()
        map[pocketmon] = "${it + 1}"
        map["${it + 1}"] = pocketmon
    }
    repeat(m) {
        w.write(map[r.readLine()])
        w.newLine()
    }
    w.close()
}