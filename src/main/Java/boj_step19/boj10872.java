import java.io.*;

public class boj10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        writer.append(factorial(n)).close();;
    }
    private static String factorial(int n) {
        return factorialTail(n, 1);
    }
    private static String factorialTail(int n, int acc) {
        if (n == 1) return String.valueOf(acc);
        return factorialTail(n - 1, acc * n);
    }
}