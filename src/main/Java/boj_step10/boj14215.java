import java.io.*;
import java.util.Arrays;

public class boj14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] triangle = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        triangle = Arrays.stream(triangle).sorted().toArray();
        if (triangle[2] >= triangle[0] + triangle[1]) writer.append(String.valueOf((triangle[0] + triangle[1]) * 2 - 1)).close();
        else writer.append(String.valueOf(Arrays.stream(triangle).sum())).close();
    }
}