import java.io.*;

public class boj27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = reader.readLine();
        int index = Integer.parseInt(reader.readLine()) - 1;
        writer.append(s.charAt(index));
        writer.close();
    }
}