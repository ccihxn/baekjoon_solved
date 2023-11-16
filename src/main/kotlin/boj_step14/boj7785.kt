import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var map = mutableMapOf<String, String>()
    var list = mutableListOf<String>()
    repeat(n) {
        val (name, log) = r.readLine().split(" ").map { it }
        if (log == "enter") map.put(name, log)
        else if (log == "leave") map.remove(name)
    }
    map.forEach { name, log ->
        list.add(name)
    }
    list = list.sorted().reversed().toMutableList()
    list.forEach {
        w.write(it)
        w.newLine()
    }
    w.close()
}