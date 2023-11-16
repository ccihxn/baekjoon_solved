import java.io.*;
import java.util.StringTokenizer;

public class boj1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());
        int h = Integer.parseInt(tokenizer.nextToken());
        if (x <= w / 2) w = 0;
        if (y <= h / 2) h = 0;
        int distanceX = Math.abs(w - x);
        int distanceY = Math.abs(h - y);
        int distance = Math.min(distanceX, distanceY);
        writer.append(String.valueOf(distance)).close();
    }
}