import java.io.*;
import java.util.StringTokenizer;

public class boj2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int time = Integer.parseInt(reader.readLine());
        int day = 24;
        int hour = 60;
        h += (time + m) / hour;
        m += time % hour;
        h %= day;
        m %= hour;
        writer.append(h + " " + m);
        writer.close();
    }
}
