import java.io.*;

public class boj25501 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                String s = reader.readLine();
                writer.append(isPalindrome(s).getX() + " " + isPalindrome(s).getY() + "\n");
            }
            writer.close();
        }
        private static Pair isPalindrome (String s) { return recursion(s, 0, s.length() - 1, 1); }
        private static Pair recursion(String s, int l, int r, int acc) {
            if (l >= r) return new Pair(1, acc);
            else if (s.charAt(l) != s.charAt(r)) return new Pair(0, acc);
            else return recursion(s, l+1, r-1, acc + 1);
        }
        private static class Pair {
            int x;
            int y;
            Pair (int x, int y) {
                this.x = x;
                this.y = y;
            }
            int getX() { return x; }
            int getY() { return y; }
        }
}