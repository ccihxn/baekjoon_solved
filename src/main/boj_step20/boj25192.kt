import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val chatlog = HashSet<String>()
    var count = 0
    repeat(n) {
        val chat = r.readLine()
        if (chat == "ENTER") chatlog.clear()
        else if (chat !in chatlog) {
            count++
            chatlog.add(chat)
        }
    }
    w.write("${count}")
    w.close()
}