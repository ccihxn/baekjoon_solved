import java.io.*;
import java.util.StringTokenizer;

public class boj2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int diceA = Integer.parseInt(tokenizer.nextToken());
        int diceB = Integer.parseInt(tokenizer.nextToken());
        int diceC = Integer.parseInt(tokenizer.nextToken());
        if (diceA == diceB && diceA == diceC) writer.append(String.valueOf(10_000 + diceA * 1000));
        else if (diceA == diceB || diceA == diceC) writer.append(String.valueOf(1000 + diceA * 100));
        else if (diceB == diceC) writer.append(String.valueOf(1000 + diceB * 100));
        else { writer.append(String.valueOf(Math.max(diceA, Math.max(diceB, diceC)) * 100)); }
        writer.close();
    }
}
