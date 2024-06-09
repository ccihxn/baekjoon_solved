#include <iostream>
using namespace std;

int main() {
    int A, B;
    cin >> A >> B;
    int R1 = A * (B % 10);
    B /= 10;
    int R10 = A * (B % 10);
    B /= 10;
    int R100 = A * (B % 10);
    cout << R1 << endl
    << R10 << endl
    << R100 << endl
    << R1 + (R10 * 10) + (R100 * 100);
}