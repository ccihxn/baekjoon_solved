#include <iostream>
using namespace std;

int main() {
    while (true) {
        int a, b, c;
        cin >> a >> b >> c;

        if (a == b && b == c && a == 0) return 0;

        int max_value = max(a, max(b, c));

        if (max_value * 2 >= a + b + c)
            cout << "Invalid";

        else {
            if (a == b && b == c)
                cout << "Equilateral";

            else if (a == b || b == c || a == c)
                cout << "Isosceles";

            else
                cout << "Scalene";
        }
    }
}