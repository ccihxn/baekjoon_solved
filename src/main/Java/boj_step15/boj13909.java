import java.io.*;

public class boj13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        double n = Double.parseDouble(reader.readLine());
        writer.append(String.valueOf((int)Math.sqrt(n))).close();
    }
}
