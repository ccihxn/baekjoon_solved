import java.io.*;

public class boj24263 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append(String.valueOf(Integer.parseInt(reader.readLine())));
        writer.newLine();
        writer.append("1").close();
    }
}