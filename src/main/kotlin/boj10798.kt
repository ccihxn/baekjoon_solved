import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val arr = Array<String>(5) { "" }
    var maxLen = 0
    for (index in arr.indices) {
        arr[index] = r.readLine()!!
        maxLen = max(maxLen, arr[index].length)
    }
    for (i in 0 until maxLen)
        for (j in arr.indices) if (arr[j].getOrNull(i) != null) w.write(arr[j].get(i).toString()) else continue
    w.close()
}