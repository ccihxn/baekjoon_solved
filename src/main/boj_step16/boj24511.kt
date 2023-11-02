import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    r.readLine().toInt()
    val queuestack: Deque<Int> = LinkedList()
    val partition = LinkedList<Int>()
    r.readLine().split(" ").map { it.toInt() }.forEach { partition.add(it) }
    r.readLine().split(" ").map { it.toInt() }.forEachIndexed { index, i ->
        if (partition[index] == 0) queuestack.add(i)
    }
    val m = r.readLine().toInt()
    r.readLine().split(" ").map { it.toInt() }.forEach { queuestack.addFirst(it) }
    repeat(m) { w.write("${queuestack.pollLast()} ") }
    w.close()
}