#include <iostream>
#include <array>
using namespace std;

int main() {
    array<int, 6> key = { 1, 1, 2, 2, 2, 8};
    for (int i = 0; i < 6; i++) {
        int chess;
        cin >> chess;
        cout << key[i] - chess << ' ';
    }
}