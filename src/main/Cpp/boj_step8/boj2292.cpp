#include <iostream>
using namespace std;

int main() {
    int N, node = 1, tmp = 6, result = 1;
    cin >> N;

    while (node < N) {
        node += tmp;
        tmp += 6;
        result++;
    }

    cout << result;
}