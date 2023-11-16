import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val peoples = HashSet<String>()
    var count = 0
    repeat(n) {
        val (a, b) = r.readLine().split(" ").map { it }
        if ((a == "ChongChong" || b == "ChongChong") && "ChongChong" !in peoples) {
            peoples.add(a)
            peoples.add(b)
            count += peoples.size
        }
        if (a in peoples && b !in peoples) {
            peoples.add(b)
            count++
        } else if (a !in peoples && b in peoples) {
            peoples.add(a)
            count++
        }
    }
    w.write(count.toString())
    w.close()
}