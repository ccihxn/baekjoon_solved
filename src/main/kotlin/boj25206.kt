import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var gradeSum = .0
    var sum = .0
    repeat(20) {
        val (name, grade, score) = r.readLine().split(" ").map { it }
        val scoreNum = if(score == "A+") 4.5 else if(score == "A0") 4.0 else if(score == "B+") 3.5 else if(score == "B0") 3.0 else if(score == "C+") 2.5 else if(score == "C0") 2.0 else if(score == "D+") 1.5 else if(score == "D0") 1.0 else 0
        if(score != "P") {
            gradeSum += grade.toDouble()
            sum += grade.toDouble() * scoreNum.toDouble()
        }
    }
    w.write(String.format("%.6f", (sum / gradeSum)))
    w.close()
}