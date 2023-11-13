import java.io.*;
import java.util.Arrays;

public class boj3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] chess = { 1, 1, 2, 2, 2, 8 };
        int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < chess.length; i++) writer.append(chess[i] - list[i] + " ");
        writer.close();
    }
}