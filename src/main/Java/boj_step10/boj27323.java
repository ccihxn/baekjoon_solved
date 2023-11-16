import java.io.*;

public class boj27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int height = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        writer.append(String.valueOf(height * width)).close();
    }
}