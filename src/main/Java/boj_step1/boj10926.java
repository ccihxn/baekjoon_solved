import java.io.*;

public class boj10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String string = reader.readLine();
        writer.append(string + "??!");
        writer.close();
    }
}