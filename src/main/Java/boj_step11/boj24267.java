import java.io.*;

public class boj24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(reader.readLine());
        writer.append(String.valueOf(n * (n - 1) * (n - 2) / 6));
        writer.newLine();
        writer.append("3").close();
    }
}
