import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class boj10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        HashSet<Integer> cardSet = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(HashSet::new));
        int m = Integer.parseInt(reader.readLine());
        LinkedHashSet<Integer> cardKeySet = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        for (int card: cardKeySet) writer.append((cardSet.contains(card)) ? "1 " : "0 ");
        writer.close();
    }
}