#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int max_value = max(a, max(b, c));

    if (max_value * 2 >= a + b + c)
        cout << (a + b + c - max_value) * 2 - 1;

    else
        cout << a + b + c;
}