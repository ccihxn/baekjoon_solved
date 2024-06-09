#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<int> baskets(N);
    for (int _ = 0; _ < M; _++) {
        int i, j, k;
        cin >> i >> j >> k;
        for (int index = i - 1; index < j; index++)
            baskets[index] = k;
    }
    for (int & i : baskets) cout << i << ' ';
}