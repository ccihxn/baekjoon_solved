import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    var cards = r.readLine().split(" ").map { it.toInt() }
    var max = 0
    for (i in 0 until cards.size - 2) {
        for (j in i + 1 until cards.size - 1) {
            for (k in j + 1 until cards.size) {
                if (cards[i] + cards[j] + cards[k] > m) continue
                if (cards[i] + cards[j] + cards[k] > max) max = cards[i] + cards[j] + cards[k]
            }
        }
    }
    w.write(max.toString())
    w.close()
}