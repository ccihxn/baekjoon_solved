import java.io.*;

public class boj24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(reader.readLine());
        writer.append(String.valueOf(n * (n - 1) / 2));
        writer.newLine();
        writer.append("2").close();
    }
}