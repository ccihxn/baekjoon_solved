import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val score = r.readLine().toInt()
    val grade = if( score >= 90) "A" else if(score >= 80) "B" else if(score >= 70) "C" else if(score >= 60) "D" else "F"
    w.write(grade)
    w.close()
}