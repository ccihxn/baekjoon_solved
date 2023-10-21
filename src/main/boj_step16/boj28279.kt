import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val deque = LinkedList<Int>()
    repeat(n) {
        val command = r.readLine()
        val token = StringTokenizer(command)
        when(token.nextToken().toInt()) {
            1 -> deque.push(token.nextToken().toInt())
            2 -> deque.add(token.nextToken().toInt())
            3 -> {
                if (deque.isEmpty()) w.write("-1\n")
                else w.write("${deque.pop()}\n")
            } 4 -> {
                if (deque.isEmpty()) w.write("-1\n")
                else w.write("${deque.removeLast()}\n")
            } 5 -> w.write("${deque.size}\n")
            6 -> w.write(deque.isEmpty().compareTo(false).toString() + "\n")
            7 -> {
                if (deque.isEmpty()) w.write("-1\n")
                else w.write("${deque.first()}\n")
            } 8 -> {
                if (deque.isEmpty()) w.write("-1\n")
                else w.write("${deque.last()}\n")
            }
        }
    }
    w.close()
}