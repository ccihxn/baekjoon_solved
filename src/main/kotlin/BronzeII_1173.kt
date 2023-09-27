import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var n = IntArray(5)
    for (i in 0 until n.size) n[i] = nextInt()
    var rate = n[1]
    var time = 0
    var count = 0
    if(rate + n[3] > n[2]) println(-1)
    else {
        while (time < n[0]) {
            count++
            if (rate + n[3] <= n[2]) {
                rate += n[3]
                time++
            } else {
                if (rate - n[4] < n[1]) {
                    rate = n[1]
                } else {
                    rate -= n[4]
                }
            }
        }
        println(count)

    }
}