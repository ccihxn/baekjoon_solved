import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    val f = sc.nextInt()
    n = n / 100 * 100
    for (i in n until n + 100) {
        if(i % f == 0) {
            println("%02d".format(i % 100))
            break
        }
    }
}