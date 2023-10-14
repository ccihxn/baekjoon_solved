import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    repeat(n) {
        val x = r.readLine().toBigInteger()
        if(x.isProbablePrime(10)) w.write(x.toString())
        else w.write(x.nextProbablePrime().toString())
        w.newLine()
    }
    w.close()
}
