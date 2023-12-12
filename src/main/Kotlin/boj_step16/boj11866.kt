
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = r.readLine().split(" ").map { it.toInt() }
    val josephus = josephus(n, k)
    w.write("<")
    josephus.forEach {
        if (it == josephus.last()) w.write("$it>")
        else w.write("$it, ")
    }
    w.close()
}

fun josephus(n: Int, k: Int): LinkedList<Int> {
    val josephus = LinkedList<Int>()
    val queue = LinkedList<Int>()
    val j = 1
    for (i in 1 .. n) queue.add(i)
    while (queue.size != 1) {
        for (i in 1 until k) {
            queue.add(queue.removeFirst())
        }
        josephus.add(queue.removeFirst())
    }
    josephus.add(queue.removeFirst())
    return josephus
}