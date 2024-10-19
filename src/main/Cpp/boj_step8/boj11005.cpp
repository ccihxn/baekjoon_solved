#include <iostream>
using namespace std;

int main() {
    string digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", result;
    int N, B;
    cin >> N >> B;

    while (N > 0) {
        result = digits[N % B] + result;
        N /= B;
    }

    cout << result;
}