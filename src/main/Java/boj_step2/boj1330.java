import java.io.*;
import java.util.StringTokenizer;

public class boj1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        if (a < b) writer.append("<");
        else if (a > b) writer.append(">");
        else writer.append("==");
        writer.close();
    }
}
