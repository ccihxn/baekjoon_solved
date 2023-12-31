import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        r.readLine()?.let { value ->
            if (value.isNotBlank()) {
                println(value)
            }
        } ?: break
    }
    w.close()
}