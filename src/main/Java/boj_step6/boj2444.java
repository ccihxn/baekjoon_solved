import java.io.*;

public class boj2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int i = 1;
        while (i <= n) {
            int j = 1;
            int k = n - i;
            while (k-- > 0) writer.append(" ");
            while (j++ <= i) writer.append("*");
            j = 2;
            while (j++ <= i) writer.append("*");
            writer.newLine();
            i++;
        }
        i = n;
        while (i > 0) {
            int j = 1;
            int k = n - i + 1;
            while (k-- > 0) writer.append(" ");
            while (j++ < i) writer.append("*");
            j = 2;
            while (j++ < i) writer.append("*");
            writer.newLine();
            i--;
        }
        writer.close();
    }
}