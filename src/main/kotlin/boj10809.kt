import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val s = r.readLine()!!
    var alphabets = IntArray(26) { -1 }
    for (i in 0 until s.length) {
        if(alphabets[s.get(i) - 'a'] != -1) continue
        alphabets[s.get(i) - 'a'] = i
    }
    for (i in 0 until alphabets.size) w.write("${alphabets[i]} ")
    w.close()
}