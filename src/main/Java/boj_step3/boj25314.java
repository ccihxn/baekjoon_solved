import java.io.*;

public class boj25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String longStr = "long ";
        writer.append(longStr.repeat(n / 4) + "int");
        writer.close();
    }
}
