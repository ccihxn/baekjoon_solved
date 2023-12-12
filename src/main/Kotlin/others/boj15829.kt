import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    r.readLine()
    val line = r.readLine()
    var sum = BigInteger.valueOf(0)
    line.forEachIndexed { index, it ->
        val tmp = it - 'a' + 1
        val under = BigInteger.valueOf(31)
        val tmpBigInt = BigInteger.valueOf(tmp.toLong())
        sum = sum.add(tmpBigInt * under.pow(index))
    }
    w.append("${sum.mod(BigInteger.valueOf(1234567891))}").close()
}