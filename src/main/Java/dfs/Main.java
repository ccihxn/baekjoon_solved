import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long balance = 0;
        long charge = 0;
        long minB = (long) Math.pow(10, 18) * 9;
        boolean valid = true;
        long n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            long a = Integer.parseInt(tokenizer.nextToken());
            long b = Integer.parseInt(tokenizer.nextToken());
            if (balance + a < 0) {
                long temp = a + b - balance;
                if (b != 0 && b < minB) minB = b;
                if (charge == 0) charge = temp;
                else {
                    charge = gcd(charge, temp);
                    if (charge <= minB && minB != Math.pow(10, 18) * 9) {
                        valid = false;
                        break;
                    }
                }
            } else if (balance + a != b) {
                valid = false;
                break;
            }
            balance = b;
        }
        if (valid && charge != 0) writer.append(String.valueOf(charge)).close();
        else if (valid) writer.append("1").close();
        else writer.append("-1").close();
    }
    private static long gcd(long a, long b) {
        return (b != 0) ? gcd(b, a % b) : a;
    }
}