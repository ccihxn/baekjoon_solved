import java.io.*;
import java.util.Arrays;

public class boj2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] trees = new int[n];
        for (int i = 0; i < n; i++) trees[i] = Integer.parseInt(reader.readLine());
        int[] distance = new int[n - 1];
        for (int i = 0; i < n - 1; i++) distance[i] = trees[i + 1] - trees[i];
        int gcd = Arrays.stream(distance).reduce((acc, i) -> gcd(acc, i)).getAsInt();
        int result = 0;
        for (int tmp: distance) result += tmp / gcd - 1;
        writer.append(String.valueOf(result)).close();
    }
    private static int gcd (int a, int b) { if (b != 0) return gcd(b, a % b); else return a; }
}