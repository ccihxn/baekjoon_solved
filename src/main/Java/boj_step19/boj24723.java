import java.io.*;

public class boj24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append(String.valueOf((int)Math.pow(2, Integer.parseInt(reader.readLine())))).close();
    }
}