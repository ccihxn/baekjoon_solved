import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    var tmp = 6
    var temp = 1
    val arr = mutableListOf<Int>()
    for(i in 0 until n) {
        arr.add(temp)
        if(arr[i] >= n) {
            w.write((i + 1).toString())
            w.close()
            return
        }
        temp += tmp
        tmp += 6
    }
}