#include <iostream>
#include <array>
#include <cmath>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    array<int, 1'000'001> isPrime;
    fill(isPrime.begin(), isPrime.end(), true);

    isPrime.at(0) = false, isPrime.at(1) = false;

    for (int i = 2; i <= sqrt(isPrime.size() - 1); i++) {
        for (int j = 2; i * j < isPrime.size(); j++)
            isPrime.at(i * j) = false;
    }

    int M, N;
    cin >> M >> N;

    for (int i = M; i <= N; i++) {
        if (isPrime.at(i))
            cout << i << '\n';
    }
}