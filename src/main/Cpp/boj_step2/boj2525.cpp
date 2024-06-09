#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    int M = B + C;
    if (M >= 60) A += (M / 60);
    M %= 60;
    A %= 24;
    cout << A << ' ' << M;
}