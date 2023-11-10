import java.io.*;

public class boj14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        if (y > 0) {
            if (x > 0) writer.append(String.valueOf(1));
            else writer.append(String.valueOf(2));
        } else {
            if (x < 0) writer.append(String.valueOf(3));
            else writer.append(String.valueOf(4));
        }
        writer.close();
    }
}
