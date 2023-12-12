import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<String>()
    val list = mutableListOf<String>()
    var count = 0
    repeat(n) {
        set.add(r.readLine())
    }
    repeat(m) {
        list.add(r.readLine())
    }
    list.forEach {
        if (set.contains(it)) count++
//        if (!set.add(it)) count++
    }
    w.write(count.toString())
    w.close()
}