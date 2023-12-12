import java.util.concurrent.CountDownLatch

fun main() = with(java.util.Scanner(System.`in`)) {
    var (n, l, d) = nextLine().split(" ").map { it.toInt() }
    var album = mutableListOf<Boolean>()
    var bells = mutableListOf<Boolean>()
    var track = l - 1
    val end = n * l + (n - 1) * 5 + d + 1
    for (i in 0 until end step(l + 5)) {
        if(i <= track)
            album.add(true)
        else {
            for(j in 0 until 5)
                album.add(false)
            track += l + 5
        }
        if (i % d == 0)
            bells.add(true)
        else
            bells.add(false)
    }
    for(i in 0 until end) {
        if(!album[i] && bells[i]) {
            println(i)
            break
        }
    }
}