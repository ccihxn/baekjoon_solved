import java.io.*;

public class boj18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append(String.valueOf(Integer.parseInt(reader.readLine()) - 543));
        writer.close();
    }
}
