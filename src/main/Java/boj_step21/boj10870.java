import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] fibonacci = new int[n + 1];
        fibonacciFun(fibonacci, n, 0);
        writer.append(String.valueOf(fibonacci[n])).close();
    }
    private static int[] fibonacciFun(int[] fibonacci, int n, int acc) {
        if (acc == n + 1) return fibonacci;
        if (acc < 2) fibonacci[acc] = acc;
        else fibonacci[acc] = fibonacci[acc - 1] + fibonacci[acc - 2];
        return fibonacciFun(fibonacci, n, acc + 1);
    }
}
