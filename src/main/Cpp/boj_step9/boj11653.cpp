#include <iostream>
using namespace std;

int main() {
    int N, devisor = 2;
    cin >> N;

    while (N != 1) {
        if (N % devisor == 0) {
            cout << devisor << endl;
            N /= devisor;
        } else
            devisor++;
    }
}