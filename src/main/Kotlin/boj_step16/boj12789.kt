import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var count = 1
    val line = Stack<Int>()
    val spare = Stack<Int>()
    val peoples = r.readLine().split(" ").map { it.toInt() }
    peoples.forEach {
        line.add(it)
    }
    while (true) {
        if (line.isEmpty() && spare.isEmpty()) {
            w.write("Nice")
            break
        }
        if (spare.isEmpty()) {
            if (line.first() != count) spare.add(line.first()) else count++
            line.removeAt(0)
        } else if (line.isEmpty()) {
            if (spare.last() != count) {
                w.write("Sad")
                break
            }
            spare.pop()
            count++
        } else {
            if (line.first() != count && spare.last() != count) {
                spare.add(line.first())
                line.removeAt(0)
            } else if (line.first() == count) {
                line.removeAt(0)
                count++
            } else if (spare.last() == count) {
                spare.pop()
                count++
            }
        }
    }
    w.close()
}