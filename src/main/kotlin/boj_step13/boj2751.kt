import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var arr = mutableListOf<Int>()
    repeat(n) {
        arr.add(r.readLine().toInt())
    }
    arr = arr.sorted().toMutableList()
    arr.forEach { w.write("$it\n") }
    w.close()
}