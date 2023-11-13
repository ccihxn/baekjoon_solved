import java.io.*;

public class boj8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int sum = n;
        while (n-- > 0) { sum += n; }
        writer.append(String.valueOf(sum));
        writer.close();
    }
}
