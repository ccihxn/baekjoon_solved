import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val queue = LinkedList<Int>()
    repeat(n) {
        val command = r.readLine()
        val token = StringTokenizer(command)
        when (token.nextToken().toString()) {
            "push" -> queue.add(token.nextToken().toInt())
            "pop" -> {
                if (queue.isEmpty()) w.write("-1\n")
                else w.write(queue.removeFirst().toString() + "\n")
            }
            "size" -> w.write(queue.size.toString() + "\n")
            "empty" -> w.write(queue.isEmpty().compareTo(false).toString() + "\n")
            "front" -> {
                if (queue.isEmpty()) w.write("-1\n")
                else w.write(queue.first().toString() + "\n")
            }
            "back" -> {
                if (queue.isEmpty()) w.write("-1\n")
                else w.write(queue.last().toString() + "\n")
            }
        }
    }
    w.close()
}