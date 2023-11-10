import java.io.*;

public class boj2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int sum = 0;
        int n10 = 1;
        while (b != 0) {
            int tmp = b % 10;
            writer.append(String.valueOf(a * tmp));
            writer.newLine();
            tmp *= n10;
            sum += a * tmp;
            n10 *= 10;
            b /= 10;
        }
        writer.append(String.valueOf(sum));
        writer.close();
    }
}
