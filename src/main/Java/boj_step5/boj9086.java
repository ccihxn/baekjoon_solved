import java.io.*;

public class boj9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String s = reader.readLine();
            writer.append(s.charAt(0) + "" + s.charAt(s.length() - 1));
            writer.newLine();
        }
        writer.close();
    }
}
