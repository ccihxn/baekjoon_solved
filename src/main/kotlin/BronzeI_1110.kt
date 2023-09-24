import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var a = n / 10
    var b = n % 10
    var sum = a + b
    var bplussum = b * 10 + sum % 10
    var count = 1
    while(bplussum != n) {
        a = b
        b = sum % 10
        sum = a + b
        bplussum = b * 10 + sum % 10
        count++
    }
    println(count)
}