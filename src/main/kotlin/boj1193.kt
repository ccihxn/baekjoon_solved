import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var sum = 0
    for (i in 1 until 10_000_000) {
        if(n in sum + 1 .. (sum + i)) {
            if (i % 2 == 0) {
                w.write("${i - (sum + i - n)}/${1 + (sum + i - n)}")
                break
            } else {
                w.write("${1 + (sum + i - n)}/${i - (sum + i - n)}")
                break
            }
        } else {
            sum += i
        }
    }
    w.close()
}