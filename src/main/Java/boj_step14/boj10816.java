import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class boj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        int[] cardSet = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        reader.readLine();
        int[] keys = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LinkedHashMap<Integer, Integer> cardKeySet = new LinkedHashMap<>();
        for (int key: keys) cardKeySet.put(key, 0);
        for (int card: cardSet) if (cardKeySet.containsKey(card)) cardKeySet.put(card, cardKeySet.getOrDefault(card, 0) + 1);
        for (int key: keys) writer.append(cardKeySet.get(key) + " ");
        writer.close();
    }
}