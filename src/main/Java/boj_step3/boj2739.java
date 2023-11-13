import java.io.*;

public class boj2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i < 10; i++) writer.append(n + " * " + i + " = " + n * i + "\n");
        writer.close();
    }
}
