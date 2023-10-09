import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val xArray = r.readLine().split(" ").map { it.toInt() }
    val arr = xArray.sorted().distinct()
    xArray.forEachIndexed() { index, x ->
        w.write("${arr.binarySearch(xArray[index])} ")
    }
    w.close()
}