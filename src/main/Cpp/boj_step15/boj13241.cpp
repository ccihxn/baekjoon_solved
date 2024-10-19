#include <functional>
#include <iostream>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    long long A, B;
    cin >> A >> B;

    function<long long(long long, long long)> gcd = [&](long long a, long long b) -> long long {
        return (b != 0) ? gcd(b, a % b) : a;
    };

    cout << (A * B) / gcd(A, B);
}