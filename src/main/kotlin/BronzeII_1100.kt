import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val chess = Array(8) { CharArray(8) }
    for (i in 0 until chess.size) {
        val rowInput = sc.next()
        chess[i] = rowInput.toCharArray()
    }

    var count = 0
    for(i in 0 until chess.size) {
        for(j in 0 until chess.size) {
            if(i % 2 == 0) {
                if(j % 2 == 0 && chess[i][j].equals('F')) count++
            } else
                if(j % 2 == 1 && chess[i][j].equals('F')) count++
        }
    }
    println(count)
}