import java.io.*;
import java.util.Arrays;

public class boj1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        writer.append(String.valueOf(Arrays.stream(list).max().getAsInt() * Arrays.stream(list).min().getAsInt())).close();
    }
}
