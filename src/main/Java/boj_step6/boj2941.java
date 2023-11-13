import java.io.*;

public class boj2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] croa = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        String line = reader.readLine();
        for (String key: croa) {
            line = line.replace(key, "A");
        }
        writer.append(String.valueOf(line.length()));
        writer.close();
    }
}
