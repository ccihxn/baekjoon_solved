import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val a = r.readLine().toInt()
    val b = r.readLine().toInt()
    val c = r.readLine().toInt()
    if (a + b + c != 180) w.write("Error")
    else {
        if(a == b && a == c) w.write("Equilateral")
        else if (a == b || a == c || b == c) w.write("Isosceles")
        else w.write("Scalene")
    }
    w.close()
}