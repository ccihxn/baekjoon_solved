import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
data class MemberNode (val id: Int, val age: Int, val name: String)
fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val n = r.readLine().toInt()
    val arr = Array<MemberNode?>(n) { null }
    repeat(n) {
        val (ageS, name) = r.readLine().split(" ").map { it }
        val age = ageS.toInt()
        arr[it] = MemberNode(it, age, name)
    }
    arr.sortWith(compareBy<MemberNode?>{ it!!.age }.thenBy { it!!.id })
    arr.forEach {
        w.write("${it!!.age} ${it!!.name}")
        w.newLine()
    }
    w.close()
}