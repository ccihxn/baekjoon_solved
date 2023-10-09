import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class boj19532 {
    fun main() {
        val r = BufferedReader(InputStreamReader(System.`in`))
        val w = BufferedWriter(OutputStreamWriter(System.out))
        var constants = r.readLine().split(" ").map { it.toInt() }.toMutableList()
        var x = 0
        var y = 0
        var a = constants[0]
        var b = constants[1]
        var c = constants[2]
        var d = constants[3]
        var e = constants[4]
        var f = constants[5]
        if(constants[0] == 0 || constants[3] == 0) {
            val lcm = constants[1] * constants[4] / gcd(constants[1], constants[4])
            a *= lcm / constants[1]
            c *= lcm / constants[1]
            d *= lcm / constants[4]
            f *= lcm / constants[4]
            x = a - d
            x = (c - f) / x
            y = (constants[2] - constants[0] * x) / constants[1]
        } else {
            val lcm = constants[0] * constants[3] / gcd(constants[0], constants[3])
            b *= lcm / constants[0]
            c *= lcm / constants[0]
            e *= lcm / constants[3]
            f *= lcm / constants[3]
            y = b - e
            y = (c - f) / y
            x = (constants[2] - constants[1] * y) / constants[0]
        }
        w.write("$x $y")
        w.close()
    }

    private fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}