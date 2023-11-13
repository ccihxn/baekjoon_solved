import java.io.*;

public class boj11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.append(line);
            writer.newLine();
            writer.flush();
        }
    }
}