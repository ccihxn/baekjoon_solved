import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var arr = IntArray(n)
    repeat(n) {
        arr[it] = r.readLine().toInt()
    }
    arr.sort()
    repeat(n) {
        w.write(arr[it].toString())
        w.newLine()
    }
    w.close()
}