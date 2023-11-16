import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var triangle = r.readLine().split(" ").map { it.toInt() }
    triangle = triangle.sorted()
    if(triangle[0] + triangle[1] <= triangle[2]) w.write(((triangle[0] + triangle[1]) * 2 - 1).toString())
    else w.write(triangle.sum().toString())
    w.close()
}