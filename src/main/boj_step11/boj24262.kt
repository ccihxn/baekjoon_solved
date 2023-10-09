import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(BufferedWriter(OutputStreamWriter(System.out))) {
    write("1\n0")
    close()
}