import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))

    val n = r.readLine().toInt()
    val partition = r.readLine().split(" ").map { it.toInt() }

    val queuestack: Deque<Int> = LinkedList()

    for (i in 0 until n) {
        val x = r.readLine().toInt()
        if (partition[i] == 0) {
            queuestack.addLast(x)
        } else {
            queuestack.addFirst(x)
        }
    }

    val m = r.readLine().toInt()
    val result = ArrayList<Int>()

    repeat(m) {
        result.add(queuestack.pollLast())
    }

    w.write(result.joinToString(" "))
    w.close()
}
