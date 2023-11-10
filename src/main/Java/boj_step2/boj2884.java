import java.io.*;
import java.util.StringTokenizer;

public class boj2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        if (m >= 45) m -= 45;
        else {
            if (h == 0) h += 23;
            else h -=1;
            m += 15;
        }
        writer.append(h + " " + m);
        writer.close();
    }
}
