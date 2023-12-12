import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var dice = nextLine().split(" ").map { it.toInt() }
    var arr = MutableList(dice.sum() + 1) { 0 }
    for (i in 1..dice[0])
        for (j in 1..dice[1])
            for (k in 1..dice[2])
                arr[i + j + k] += 1
    println(arr.indexOf(arr.maxOf { it }))
}