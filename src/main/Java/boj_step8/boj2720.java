import java.io.*;

public class boj2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int c = Integer.parseInt(reader.readLine());
            writer.append(c / 25 + " ");
            c %= 25;
            writer.append(c / 10 + " ");
            c %= 10;
            writer.append(c / 5 + " ");
            c %= 5;
            writer.append(String.valueOf(c));
            writer.newLine();
        }
        writer.close();
    }
}