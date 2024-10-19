#include <iostream>
#include <cmath>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        unsigned int n;
        cin >> n;

        if (n < 2) {
            cout << '2' << '\n';
            continue;
        }

        while (true) {
            bool isPrime = true;

            for (int j = 2; j <= sqrt(n); j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                cout << n << '\n';
                break;
            }

            n++;
        }
    }
}