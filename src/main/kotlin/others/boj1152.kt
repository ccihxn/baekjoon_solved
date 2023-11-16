import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var arr = mutableListOf("")
    val s = sc.nextLine()
    var tmp = 0
    arr = s.split(" ").toMutableList()
    while (tmp < arr.size) {
        if (arr[tmp].isEmpty()) {
            arr.removeAt(tmp)
        } else {
            tmp++
        }
    }
    println(arr.size)
}