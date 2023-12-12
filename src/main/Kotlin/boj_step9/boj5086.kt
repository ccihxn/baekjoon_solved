import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w =  BufferedWriter(OutputStreamWriter(System.out))
    while(true) {
        val (a, b) = r.readLine().split(" ").map { it.toInt() }
        if(a == 0 && b == 0) break
        val result = if(b % a == 0) "factor\n" else if (a % b == 0) "multiple\n" else "neither\n"
        w.write(result)
    }
    w.close()
}