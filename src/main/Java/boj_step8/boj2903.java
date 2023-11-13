import java.io.*;

public class boj2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine()) + 1, dots = 0, tmp = 2;
        while (n-- > 0) {
            dots = tmp * tmp;
            tmp *= 2;
            tmp--;
        }
        writer.append(String.valueOf(dots));
        writer.close();
    }
}