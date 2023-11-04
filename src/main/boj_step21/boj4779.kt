import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    var n = r.readLine().toInt()
    n = 3.0.pow(n).toInt()
    var kanto = BooleanArray(n) {true}
    kanto = kantoFun(kanto, n)
    var result = ""
    kanto.forEach {
        if(it)  result += "-"
        else result += " "
    }
    w.write(result)
    w.close()
}

private fun kantoFun(kanto: BooleanArray, n: Int): BooleanArray {
    if(n == 1) return kanto
    for (i in n / 3 + 1 .. n * (2 / 3)) kanto[i] = false
    if (n * 3 <= kanto.size) {
        for (i in n / 3 + 1 + n * 2 .. n * (2 / 3) + n * 2) kanto[i] = false
    }
    return kantoFun(kanto, n / 3)
}