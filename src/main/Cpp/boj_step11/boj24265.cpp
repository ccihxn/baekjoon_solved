#include <iostream>
using namespace std;

int main() {
    long sum = 0, n;
    cin >> n;

    for (int i = 1; i < n; i++)
        sum += i;

    cout << sum << endl << 2;
}