import java.io.*;
import java.util.StringTokenizer;

public class boj1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        writer.append(String.valueOf(tokenizer.countTokens()));
        writer.close();
    }
}