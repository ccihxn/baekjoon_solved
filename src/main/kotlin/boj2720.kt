import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val test = r.readLine().toInt()
    val (quarter, dime, nickel, penny) = "25 10 5 1".split(" ").map { it.toInt() }
    repeat(test) {
        var change = r.readLine().toInt()
        w.write("${change / quarter} ")
        change %= quarter
        w.write("${change / dime} ")
        change %= dime
        w.write("${change / nickel} ")
        change %= nickel
        w.write("${change}\n")
    }
    w.close()
}