import java.io.*;
import java.math.BigInteger;

public class boj24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger n = new BigInteger(reader.readLine());
        writer.append(String.valueOf(n.pow(3)));
        writer.newLine();
        writer.append("3").close();
    }
}
