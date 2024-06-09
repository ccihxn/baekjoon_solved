#include <iostream>
using namespace std;

int main() {
    int x, y;
    cin >> x >> y;
    int result;
    if (y > 0) {
        if (x > 0) result = 1;
        else result = 2;
    } else {
        if (x < 0) result = 3;
        else result = 4;
    }
    cout << result;
}