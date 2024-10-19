#include <iostream>
using namespace std;

int main() {
    int line = 2, N;
    cin >> N;

    for (int i = 0; i < N; i++)
        line = line * 2 - 1;

    cout << line * line;
}