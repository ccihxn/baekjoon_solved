import java.util.Scanner
import javax.print.attribute.standard.JobHoldUntil

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val names = Array(n) { sc.next() }
    var alphabets = IntArray(26) { 0 }
    var count = 0
    for (i in 0 until names.size) alphabets[names[i][0].toInt() - 97]++
    for (i in 0 until alphabets.size) {
        if (alphabets[i] >= 5) {
            print((i + 97).toChar())
            count++
        }
    }
    if (count == 0) print("PREDAJA")
}