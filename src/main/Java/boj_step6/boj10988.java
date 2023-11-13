import java.io.*;

public class boj10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        int isPalindrome = (line.equals(new StringBuilder(line).reverse().toString())) ? 1 : 0;
        writer.append( String.valueOf(isPalindrome));
        writer.close();
    }
}