import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(BufferedWriter(OutputStreamWriter(System.out))) {
    write("         ,r'\"7\n" +
            "r`-_   ,'  ,/\n" +
            " \\. \". L_r'\n" +
            "   `~\\/\n" +
            "      |\n" +
            "      |")
    close()
}