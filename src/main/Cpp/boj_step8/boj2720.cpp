#include <iostream>
#include <array>
using namespace std;

int main() {
    int T;
    cin >> T;
    array<int, 3> units{25, 10, 5};

    for (int i = 0; i < T; i++) {
        int C;
        cin >> C;

        for (int &unit : units) {
            cout << C / unit << ' ';
            C %= unit;
        }
        cout << C << endl;
    }
}