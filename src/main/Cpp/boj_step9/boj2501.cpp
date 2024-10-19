#include <iostream>
using namespace std;

int main() {
    int N, K, pos = 0, devisor = 1;
    cin >> N >> K;
    while (pos != K) {
        if (N % devisor == 0)
            pos++;
        devisor++;
    }
}