import java.io.*;
import java.util.*;

public class boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        HashSet<String> noListen = new HashSet<>();
        HashSet<String> noLook = new HashSet<>();
        List<String> noListenLook = new ArrayList<>();
        while (n-- > 0) noListen.add(reader.readLine());
        while (m-- > 0) noLook.add(reader.readLine());
        for (String noListner: noListen) if (noLook.contains(noListner)) noListenLook.add(noListner);
        Collections.sort(noListenLook);
        writer.append(noListenLook.size() + "\n");
        for (String it: noListenLook) writer.append(it + "\n");
        writer.close();
    }
}