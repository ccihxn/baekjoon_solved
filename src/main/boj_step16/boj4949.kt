import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Boolean>()
    while (true) {
        stack.clear()
        val str = r.readLine()
        if (str.equals(".")) break
        str.forEach {
            when (it) {
                '(' -> stack.add(true)
                '[' -> stack.add(false)
                ')' -> {
                    if (!stack.contains(true)) {
                        w.write("no\n")
                        return@forEach
                    } else stack.remove(true)
                }

                ']' -> {
                    if (!stack.contains(false)) {
                        w.write("no\n")
                        return@forEach
                    } else stack.remove(false)
                }
            }
        }
        if (stack.isEmpty()) w.write("yes\n")
        else w.write("no\n")

    }
    w.close()
}