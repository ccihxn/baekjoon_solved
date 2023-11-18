import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        writer.append(String.valueOf(factorial(n))).close();
    }
    private static long factorial (int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}