import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var (D, H, T) = nextLine().split(" ").map { it.toInt() }
    var d = Math.sqrt((D * D) / (H * H + T * T).toDouble())
    var h = (d * H).toInt()
    var t = (d * T).toInt()
    println("$h $t")
}