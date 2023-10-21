import java.util.*

fun main() {
    val stack = Stack<Int>()
    stack.add(1)
    stack.add(2)
    stack.add(3)
    stack.add(4)
    stack.add(5)
    stack.removeAt(0)
    println(stack[0])
}