import java.io.*;
import java.util.HashSet;

public class boj25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        HashSet<String> chatLog = new HashSet<>();
        int count = 0;
        while (n-- > 0) {
            String chat = reader.readLine();
            if (chat.equals("ENTER")) chatLog.clear();
            else if (!chatLog.contains(chat)) {
                chatLog.add(chat);
                count++;
            }
        }
        writer.append(String.valueOf(count)).close();
    }
}