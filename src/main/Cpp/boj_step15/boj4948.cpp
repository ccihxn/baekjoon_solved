#include <iostream>
#include <vector>
#include <cmath>
#include <functional>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    size_t size = 123'456 * 2 + 1;
    vector<int> isPrime(size);
    fill(isPrime.begin(),isPrime.end(), true);
    isPrime.at(0) = false, isPrime.at(1) = false;

    for (int i = 2; i <= sqrt(size); i++)
        for (size_t j = 2; i * j <= size; j++)
            isPrime.at(i * j) = false;

    function<int(vector<int>, int)> count_prime = [&] (vector<int> isPrime, int n) -> int {
        int res = 0;

        for (int i = n + 1; i <= n * 2; i++)
            if (isPrime.at(i))
                res++;

        return res;
    };

    int n;

    while (cin >> n && n > 0)
        cout << count_prime(isPrime, n) << '\n';
}