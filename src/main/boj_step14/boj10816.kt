import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val cardset = r.readLine().split(" ").map { it.toInt() }
    val m = r.readLine().toInt()
    val keys = r.readLine().split(" ").map { it.toInt() }
    var keymap = linkedMapOf<Int, Int>()
    keys.forEach {
        keymap[it] = 0
    }
    cardset.forEach {
        if(keymap.containsKey(it)) keymap[it] = keymap.getValue(it) + 1
    }
    keys.forEach {
        w.write("${keymap[it]} ")
    }
    w.close()
}