#include <iostream>
using namespace std;

int main() {
    int a1, a0, c, a;
    cin >> a1 >> a0 >> c >> a;
    cout << ((a1 * a + a0 <= c * a && c>= a1) ? 1 : 0);
}