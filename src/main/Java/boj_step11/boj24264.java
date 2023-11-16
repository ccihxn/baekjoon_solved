import java.io.*;

public class boj24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(reader.readLine());
        writer.append(String.valueOf(n * n));
        writer.newLine();
        writer.append("2").close();
    }
}