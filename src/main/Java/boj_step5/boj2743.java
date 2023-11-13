import java.io.*;

public class boj2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append(String.valueOf(reader.readLine().length()));
        writer.close();
    }
}
