#include <iostream>
using namespace std;

int main() {
    int a, b, c, reward;
    cin >> a >> b >> c;
    if (a == b && b == c) reward = 10000 + a * 1000;
    else if (a == b || b == c) reward = 1000 + b* 100;
    else if (a == c) reward = 1000 + a * 100;
    else reward = max(a, max(b, c)) * 100;
    cout << reward;
}