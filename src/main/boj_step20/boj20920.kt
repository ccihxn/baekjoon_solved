import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    val notes = HashMap<String, Int>()
    repeat(n) {
        val word = r.readLine()
        if (word.length >= m) {
            if (word !in notes) notes.put(word, 1)
            else notes.set(word, notes.getValue(word) + 1)
        }
    }
    val result = notes.entries.sortedWith({ x, y ->
        when {
            x.value != y.value -> {
                y.value.compareTo(x.value)
            }
            x.key.length != y.key.length -> {
                y.key.length.compareTo(x.key.length)
            }
            else -> {
                x.key.compareTo(y.key)
            }
        }
    })
    result.forEach { w.write("${it.key}\n") }
    w.close()
}