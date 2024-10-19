#include <iostream>
#include <array>
#include <list>
#include <numeric>
using namespace std;

bool isPrime(int number) {
    array<int, 10001> primes{};
    primes.fill(true), primes.at(0) = false, primes.at(1) = false;

    for (int i = 2; i <= primes.size() / 2; i++)
        for (int j = i * 2; j < primes.size(); j += i)
            primes.at(j) = false;

    return primes.at(number);
}

int main() {
    int M, N;
    list<int> primes;
    cin >> M >> N;

    for (int i = M; i <= N; i++) {
        if (isPrime(i))
            primes.push_back(i);
    }

    if (primes.empty()) cout << -1;
    else {
        cout << accumulate(primes.begin(), primes.end(), 0) << endl;
        cout << primes.front();
    }
}