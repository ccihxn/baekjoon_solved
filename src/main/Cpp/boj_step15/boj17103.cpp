#include <iostream>
#include <array>
#include <cmath>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    array<bool, 1'000'001> isPrime;
    fill(isPrime.begin(), isPrime.end(), true);
    isPrime.at(0) = false, isPrime.at(1) = false;

    for (int i = 2; i <= sqrt(isPrime.size()); i++)
        for (int j = 2; i * j < isPrime.size(); j++)
            isPrime.at(i * j) = false;

    int T;
    cin >> T;

    for (int _ = 0; _ < T; _++) {
        int N, res = 0;
        cin >> N;

        for (int i = 2; i <= N / 2; i++)
            if (isPrime.at(i) && isPrime.at(N - i))
                res++;

        cout << res << '\n';
    }
}