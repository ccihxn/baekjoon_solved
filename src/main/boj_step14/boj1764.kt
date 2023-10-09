import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    val noListen = mutableSetOf<String>()
    val noLook = mutableSetOf<String>()
    var set = mutableSetOf<String>()
    repeat(n) {
        noListen.add(r.readLine())
    }
    repeat(m) {
        noLook.add(r.readLine())
    }
    noListen.forEach {
        if (noLook.contains(it)) {
            set.add(it)
        }
    }
    w.write(set.size.toString())
    w.newLine()
    set = set.sorted().toMutableSet()
    set.forEach {
        w.write(it)
        w.newLine()
    }
    w.close()
}
