import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var list = mutableListOf<Int>()
    repeat(5) {
        list.add(r.readLine().toInt())
    }
    w.write("${list.sum() / list.size}\n")
    list = list.sorted().toMutableList()
    w.write(list[2].toString())
    w.close()
}