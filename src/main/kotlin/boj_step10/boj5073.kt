import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        var triangle = r.readLine().split(" ").map { it.toInt() }
        if(triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) break
        triangle = triangle.sorted()
        if (triangle[0] + triangle[1] <= triangle[2]) w.write("Invalid\n")
        else if (triangle[0] == triangle[1] && triangle[0] == triangle[2] && triangle[1] == triangle[2]) w.write("Equilateral\n")
        else if (triangle[0] == triangle[1] || triangle[0] == triangle[2] || triangle[1] == triangle[2]) w.write("Isosceles\n")
        else w.write("Scalene\n")
    }
    w.close()
}