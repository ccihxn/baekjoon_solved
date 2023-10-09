import java.awt.event.KeyAdapter
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val cards = r.readLine().split(" ").map { it.toInt() }.toMutableSet()
    val m = r.readLine().toInt()
    val keys = r.readLine().split(" ").map { it.toInt() }
    keys.forEach {
        if (!cards.add(it)) w.write("1 ") else w.write("0 ")
    }
    w.close()
}