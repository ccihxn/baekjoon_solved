import java.io.*;

public class boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        String line = reader.readLine();
        int sum = 0;
        for (int i = 0; i < line.length(); i++) sum += line.charAt(i) - '0';
        writer.append(String.valueOf(sum));
        writer.close();
    }
}