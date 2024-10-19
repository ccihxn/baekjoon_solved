#include <functional>
#include <iostream>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int A, B, C, D;
    cin >> A >> B >> C >> D;
    A = A * D + B  * C;
    B *= D;

    function<int(int, int)> gcd = [&](int a, int b) -> int {
        return (b != 0) ? gcd(b, a % b) : a;
    };

    int tmp = gcd(A, B);

    cout << (A / tmp) << ' ' << (B / tmp);
}