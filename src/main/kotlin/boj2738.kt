import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine()!!.split(" ").map { it.toInt() }
    var a = Array(n) { IntArray(m) }
    val b = Array(n) { IntArray(m) }
    a.forEach {
        val arr = r.readLine()!!.split(" ").map { it.toInt() }
        for (i in 0 until m) it[i] = arr[i]
    }
    b.forEach {
        val arr = r.readLine()!!.split(" ").map { it.toInt() }
        for (i in 0 until m) it[i] = arr[i]
    }
    for(i in 0 until a.size) {
        for (j in 0 until a[i].size) {
            a[i][j] += + b[i][j]
            w.write(a[i][j].toString() + " ")
        }
        w.write("\n")
    }
    w.close()
}