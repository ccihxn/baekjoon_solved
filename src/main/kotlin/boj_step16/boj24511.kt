import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val isQueuestack = r.readLine().split(" ").map { it.toInt() }
    val queuestack = LinkedList<Int>()
    r.readLine().split(" ").map { it.toInt() }.forEachIndexed { index, i ->
        if (isQueuestack[index] == 0) queuestack.add(i)
    }
    val m = r.readLine().toInt()
    r.readLine().split(" ").map { it.toInt() }.forEach {
        queuestack.push(it)
    }
    repeat(m) { w.append("${queuestack.removeLast()} ") }
    w.close()
}