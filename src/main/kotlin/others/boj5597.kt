import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var students = IntArray(31) {0}
    var cnt = 28
    while (cnt-- > 0) {
        val studentNo = r.readLine()!!.toInt()
        students[studentNo]++
    }
    for(i in 1 until students.size) if(students[i] == 0) w.write(i.toString() + "\n")
    w.close()
}