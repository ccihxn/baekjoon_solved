#include <iostream>
#include <list>
#include <numeric>
using namespace std;

int main() {
    int N;
    cin >> N;

    for (int i = 1; i < N; i++) {
        int res = i;
        string k = to_string(i);

        for (const char &c : k)
            res += c - '0';

        if (res == N) {
            cout << i;
            return 0;
        }
    }

    cout << 0;
}