import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val stack = Stack<Char>()
    repeat(n) {
        stack.clear()
        val bracket = r.readLine()
        bracket.forEach {
            if (it == '(') {
                stack.add(it)
            } else {
                if (stack.isEmpty()) {
                    w.write("NO\n")
                    return@repeat
                } else stack.pop()
            }
        }
        if (stack.isEmpty()) w.write("YES\n")
        else w.write("NO\n")
    }
    w.close()
}