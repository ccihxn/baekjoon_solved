import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val s = r.readLine()!!
    val map = mutableMapOf<Char, Int>()
    s.forEach {
        val char = it.toLowerCase()

        if (map.containsKey(char)) map[char] = map[char]!!.plus(1)
        else map.set(char, 1)
    }
    val max = map.maxBy { it.value }

    if(map.filter { it.value == max!!.value }.count() > 1)
        w.write("?")
    else w.write(max!!.key.toUpperCase().toString())
    w.close()
}