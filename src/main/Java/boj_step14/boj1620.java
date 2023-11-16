import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer =  new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        HashMap<String, String> pocketmonList = new HashMap<>();
        int index = 1;
        while (n-- > 0) {
            String name = reader.readLine();
            pocketmonList.put(name, String.valueOf(index));
            pocketmonList.put(String.valueOf(index++), name);
        }
        while(m-- > 0) writer.append(pocketmonList.get(reader.readLine()) + "\n");
        writer.close();
    }
}
