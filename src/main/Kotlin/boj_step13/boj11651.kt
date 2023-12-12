import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

data class Node(val x: Int, val y: Int)

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val arr = Array<Node?>(n) { null }
    repeat(n) {
        val (x, y) = r.readLine()!!.split(" ").map { it.toInt() }
        arr[it] = Node(x, y)
    }
    arr.sortWith(compareBy<Node?> { it!!.y }.thenBy { it!!.x })
    arr.forEach {
        w.write("${it!!.x} ${it!!.y}")
        w.newLine()
    }
    w.close()
}