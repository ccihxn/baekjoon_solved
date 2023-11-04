import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    repeat(r.readLine().toInt()) {
        val s = r.readLine()
        val result = isPalindrome(s)
        w.appendLine("${result.first} ${result.second}")
    }
    w.close()
}

private fun recursion(s: String, l: Int, r: Int, acc: Int): Pair<Int, Int> {
    if (l >= r) return Pair(1, acc)
    else if (s[l] != s[r]) return Pair(0, acc)
    else return recursion(s, l + 1, r - 1, acc + 1)
}

private fun isPalindrome(s: String): Pair<Int, Int> {
    return recursion(s, 0, s.length - 1, 1)
}