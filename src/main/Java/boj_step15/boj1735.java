import java.io.*;
import java.util.StringTokenizer;

public class boj1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int firstNumerator = Integer.parseInt(tokenizer.nextToken());
        int firstDenominator = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(reader.readLine());
        int secondNumerator = Integer.parseInt(tokenizer.nextToken());
        int secondDenominator = Integer.parseInt(tokenizer.nextToken());
        int resultNumerator = firstNumerator * secondDenominator + secondNumerator * firstDenominator;
        int resultDenaminator = firstDenominator * secondDenominator;
        int temp = resultNumerator;
        resultNumerator /= gcd(resultNumerator, resultDenaminator);
        resultDenaminator /= gcd(temp, resultDenaminator);
        writer.append(resultNumerator + " " + resultDenaminator).close();
    }
    private static int gcd (int a, int b) { if (b != 0) return gcd (b, a % b); else return a; }
}