import java.io.*;

public class boj11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(reader.readLine());
        int divisor = 2;
        while (n != 1) {
            if (n % divisor == 0) {
                writer.append(String.valueOf(divisor));
                writer.newLine();
                n /= divisor;
            } else divisor++;
        }
        writer.close();
    }
}