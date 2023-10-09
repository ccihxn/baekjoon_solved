import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val r = BufferedReader(InputStreamReader(System.`in`))
    val w = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = r.readLine().split(" ").map { it.toInt() }
    val chess = Array(n) { CharArray(m) }
    repeat(n) {
        chess[it] = r.readLine().toCharArray()
    }
    var count = 0
    for (i in chess.indices) {
        for (j in chess[i].indices) {
            if (chess[i][j] == 'W') {
                if (i == 0) {
                    if (j == 0) {
                        if (chess[i][j] == chess[i][j + 1]) {
                            count++
                            chess[i][j + 1] = 'B'
                        }
                    } else if (j == chess[i].size - 1) {
                        if (chess[i][j] == chess[i][j - 1]) {
                            count++
                            chess[i][j - 1] = 'B'
                        }
                    }
                    if (chess[i][j] == chess[i + 1][j]) {
                        count++
                        chess[i + 1][j] = 'B'
                    }
                } else if (i == chess.size - 1) {
                    if (i == 0) {
                        if (j == 0) {
                            if (chess[i][j] == chess[i][j + 1]) {
                                count++
                                chess[i][j + 1] = 'B'
                            }
                        } else if (j == chess[i].size - 1) {
                            if (chess[i][j] == chess[i][j - 1]) {
                                count++
                                chess[i][j - 1] = 'B'
                            }
                        }
                        if (chess[i][j] == chess[i - 1][j]) {
                            count++
                            chess[i - 1][j] = 'B'
                        }
                    }
                } else {
                    if (j == 0) {
                        if (chess[i][j] == chess[i][j + 1]) {
                            count++
                            chess[i][j + 1] = 'B'
                        }
                    } else if (j == chess[i].size - 1) {
                        if (chess[i][j] == chess[i][j - 1]) {
                            count++
                            chess[i][j - 1] = 'B'
                        }
                    }
                    if (chess[i][j] == chess[i - 1][j]) {
                        count++
                        chess[i - 1][j] = 'B'
                    }
                    if (chess[i][j] == chess[i + 1][j]) {
                        count++
                        chess[i + 1][j] = 'B'
                    } else {
                        if (chess[i][j] == chess[i][j - 1]) {
                            count++
                            chess[i][j - 1] = 'B'
                        }
                        if (chess[i][j] == chess[i][j + 1]) {
                            count++
                            chess[i][j + 1] = 'B'
                        }
                    }
                }
            } else if (chess[i][j] == 'B') {
                if (i == 0) {
                    if (j == 0) {
                        if (chess[i][j] == chess[i][j + 1]) {
                            count++
                            chess[i][j + 1] = 'W'
                        }
                    } else if (j == chess[i].size - 1) {
                        if (chess[i][j] == chess[i][j - 1]) {
                            count++
                            chess[i][j - 1] = 'W'
                        }
                    }
                    if (chess[i][j] == chess[i + 1][j]) {
                        count++
                        chess[i + 1][j] = 'W'
                    }
                } else if (i == chess.size - 1) {
                    if (i == 0) {
                        if (j == 0) {
                            if (chess[i][j] == chess[i][j + 1]) {
                                count++
                                chess[i][j + 1] = 'W'
                            }
                        } else if (j == chess[i].size - 1) {
                            if (chess[i][j] == chess[i][j - 1]) {
                                count++
                                chess[i][j - 1] = 'W'
                            }
                        }
                        if (chess[i][j] == chess[i - 1][j]) {
                            count++
                            chess[i - 1][j] = 'W'
                        }
                    }
                } else {
                    if (j == 0) {
                        if (chess[i][j] == chess[i][j + 1]) {
                            count++
                            chess[i][j + 1] = 'W'
                        }
                    } else if (j == chess[i].size - 1) {
                        if (chess[i][j] == chess[i][j - 1]) {
                            count++
                            chess[i][j - 1] = 'W'
                        }
                    }
                    if (chess[i][j] == chess[i - 1][j]) {
                        count++
                        chess[i - 1][j] = 'W'
                    }
                    if (chess[i][j] == chess[i + 1][j]) {
                        count++
                        chess[i + 1][j] = 'W'
                    }
                    if (chess[i][j] == chess[i][j - 1]) {
                        count++
                        chess[i][j - 1] = 'W'
                    }
                    if (chess[i][j] == chess[i][j + 1]) {
                        count++
                        chess[i][j + 1] = 'W'
                    }

                }
            }
        }
    }
}