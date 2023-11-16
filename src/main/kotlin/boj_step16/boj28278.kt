import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val r = Scanner(System.`in`)
    val n = r.nextInt()
    val stack = Stack<Int>()
    repeat(n) {
        val x = r.nextInt()
        if (x == 1) {
            val y = r.nextInt()
            stack.add(y)
        }
        if (x == 2) {
            if (stack.isNotEmpty()) {
                w.write(stack.pop().toString())
                w.newLine()
            } else w.write("-1\n")
        }
        if (x == 3) {
            w.write(stack.size.toString())
            w.newLine()
        }
        if (x == 4) {
            w.write(stack.isEmpty().compareTo(false).toString())
            w.newLine()
        }
        if (x == 5) {
            if (stack.isNotEmpty()) {
                w.write(stack.last().toString())
                w.newLine()
            } else w.write("-1\n")
        }
    }
    w.close()
}