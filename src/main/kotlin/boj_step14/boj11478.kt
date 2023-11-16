import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val str = r.readLine()
    val set = mutableSetOf<String>()
    repeat(str.length) {
        for (i in 0 until str.length - it) set.add(str.substring(i, i + it + 1))
    }
    w.write(set.size.toString())
    w.close()
}