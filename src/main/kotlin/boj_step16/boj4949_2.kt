import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val list = Stack<Boolean>()
    while (true) {
        list.clear()
        val s = r.readLine()
        if (s.equals(".")) break
        var b = false
        s.forEach {
            when (it) {
                '(' -> list.push(true)
                '[' -> list.push(false)
                ')' -> {
                    if (list.isNotEmpty() && list.last()) list.pop()
                    else {
                        list.push(true)
                        b = true
                        return@forEach
                    }
                }
                ']' -> {
                    if (list.isNotEmpty() && !list.last()) list.pop()
                    else {
                        list.push(false)
                        b = true
                        return@forEach
                    }
                }
            }
        }
        if (list.isEmpty() && !b) w.appendLine("yes")
        else w.appendLine("no")
    }
    w.close()
}