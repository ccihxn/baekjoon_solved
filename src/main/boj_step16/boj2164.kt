import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val cardset = LinkedList<Int>()
    repeat(n) {
        cardset.add(it + 1)
    }
    while(cardset.size != 1) {
        cardset.removeFirst()
        cardset.add(cardset.removeFirst())
    }
    w.write(cardset.pop().toString())
    w.close()
}