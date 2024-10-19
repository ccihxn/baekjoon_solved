#include <iostream>
using namespace std;

int main() {
    int N, sum = 0;
    cin >> N;

    for (int i = 0; i < 10000000; i++) {
        if (N >= sum + 1 && N<= sum + i) {
            if (i % 2 == 0) {
                cout << i - (sum + i - N) << '/' << 1 + (sum + i - N);
                break;
            } else {
                cout << 1 + (sum + i - N) << '/' << i - (sum + i - N);
                break;
            }
        } else
            sum += i;
    }
}