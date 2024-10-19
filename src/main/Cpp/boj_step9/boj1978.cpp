#include <iostream>
#include <array>
#include <list>
using namespace std;

bool isPrime(int number) {
    array<bool, 1001> primes{};
    primes.fill(true), primes[0] = false, primes[1] = false;
    for (int i = 2; i <= primes.size() / 2; i++)
        if (primes[i])
            for (int j = i * 2; j < primes.size(); j += i)
                primes[j] = false;
    return primes[number];
}

int main() {
    int N, number;
    cin >> N;
    list<int> prime_count;

    for (int i = 0; i < N; i++) {
        cin >> number;
        if (isPrime(number))
            prime_count.push_back(1);
    }

    cout << prime_count.size();
}