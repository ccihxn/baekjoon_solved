#include <iostream>
using namespace std;

int main() {
    int x = 1, y = 1;
    while (x != 0 || y != 0) {
        cin >> x >> y;
        cout << ((y % x == 0) ? "factor" : (x % y == 0) ? "multiple" : "neither");
    }
}