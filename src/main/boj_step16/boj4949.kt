import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val s = r.readLine()
        if (s.equals(".")) break
        w.appendLine(if (isVPS(s)) "yes" else "no")
    }
    w.close()
}

private fun isVPS(s: String): Boolean {
    val list = Stack<Boolean>()
    s.forEach {
        when (it) {
            ')' -> if (list.isEmpty() || !list.pop()) return false
            ']' -> if (list.isEmpty() || list.pop()) return false
            '(' -> list.push(true)
            '[' -> list.push(false)
        }
    }
    if (list.isEmpty()) return true
    else return false
}