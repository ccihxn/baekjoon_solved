import java.io.*;
import java.util.StringTokenizer;

public class boj3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] xList = new int[3];
        int[] yList = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            xList[i] = Integer.parseInt(tokenizer.nextToken());
            yList[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int x, y;
        if (xList[0] == xList[1]) x = xList[2];
        else if (xList[0] == xList[2]) x = xList[1];
        else x = xList[0];
        if (yList[0] == yList[1]) y = yList[2];
        else if (yList[0] == yList[2]) y = yList[1];
        else y = yList[0];
        writer.append(x + " " + y).close();
    }
}