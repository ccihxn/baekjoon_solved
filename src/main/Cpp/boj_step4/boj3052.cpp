#include <iostream>
#include <array>
using namespace std;

int main() {
    array<int, 42> list;
    for (int i = 0; i < 10; i++) {
        int n;
        cin >> n;
        list[n % 42]++;
    }
    int count = 0;
    for (int & i : list) {
        if (i != 0) count++;
    }
    cout << count;
}