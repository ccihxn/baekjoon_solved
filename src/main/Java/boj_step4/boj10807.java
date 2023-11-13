import java.io.*;
import java.util.StringTokenizer;

public class boj10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(reader.readLine());
        int[] list = new int[size];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int key = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(tokenizer.nextToken());
            if (list[i] == key) count++;
        }
        writer.append(String.valueOf(count));
        writer.close();
    }
}
