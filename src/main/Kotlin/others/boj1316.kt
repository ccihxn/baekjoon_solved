import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var count = 0
    repeat(r.readLine().toInt()) {
        var tmp = 0
        val list = mutableListOf<Char>()
        val str = r.readLine()
        list.add(str.get(0))
        for (i in 1 until str.length) {
            if (str.get(i) == str.get(i - 1)) continue
            else {
                if (str.get(i) in list) {
                    tmp++
                    break
                } else list.add(str.get(i))
            }
        }
        if (tmp == 0) count++
    }
    w.write(count.toString())
    w.close()
}