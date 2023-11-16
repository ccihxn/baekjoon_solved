import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class boj17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        boolean[] isPrime = new boolean[1_000_000];
        Arrays.fill(isPrime, true);
        isPrime[0] = false; isPrime[1] = false;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < isPrime.length; i++) {
            if (!isPrime[i]) continue;
            primes.add(i);
            for (int j = i * 2; j < isPrime.length; j += i) isPrime[j] = false;
        }
        while (n-- > 0) {
            int partition = Integer.parseInt(reader.readLine());
            AtomicInteger count = new AtomicInteger(0);
            primes.forEach(it -> {
                if (it > partition / 2) return;
                if (isPrime[partition - it]) count.getAndIncrement();
            });
            writer.append(count + "\n");
        }
        writer.close();
    }
}