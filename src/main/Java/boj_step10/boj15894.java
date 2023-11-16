import java.io.*;

public class boj15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append(String.valueOf(Long.parseLong(reader.readLine()) * 4)).close();
    }
}