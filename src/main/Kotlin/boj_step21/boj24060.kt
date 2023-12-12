import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val tmp = IntArray(500_000)
private var count = 0
private var result = -1
private var temp = 0
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = r.readLine().split(" ").map { it.toInt() }
    temp = k
    val list = r.readLine().split(" ").map { it.toInt() }.toIntArray()
    mergeSort(list, 0, n - 1)
    w.append(result.toString())
    w.close()
}

private fun mergeSort(list: IntArray, p: Int, r: Int) {
    if (p < r) {
        val q = (p + r) / 2
        mergeSort(list, p, q)
        mergeSort(list, q + 1, r)
        merge(list, p, q, r)
    }
}

private fun merge(list: IntArray, p: Int, q: Int, r: Int) {
    var i = p
    var j = q + 1
    var t = 0
    while (i <= q && j <= r) {
        if (list[i] <= list[j]) tmp[t++] = list[i++]
        else tmp[t++] = list[j++]
    }
    while (i <= q) tmp[t++] = list[i++]
    while (j <= r) tmp[t++] = list[j++]
    i = p
    t = 0
    while (i <= r) {
        list[i++] = tmp[t++]
        if (++count == temp) result = tmp[t - 1]
    }
}