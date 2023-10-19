import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val k = r.readLine().toInt()
    val stack = Stack<Int>()
    var sumMoney = 0
    repeat(k) {
        val money = r.readLine().toInt()
        if (money == 0) {
            sumMoney -= stack.pop()
        } else {
            stack.add(money)
            sumMoney += money
        }
    }
    w.write(sumMoney.toString())
    w.close()
}