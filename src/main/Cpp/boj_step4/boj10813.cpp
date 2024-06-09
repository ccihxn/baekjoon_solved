#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<int> baskets(N);
    iota(baskets.begin(), baskets.end(), 1);
    for (int index = 0; index < M; index++) {
        int i, j;
        cin >> i >> j;
        int tmp = baskets[i - 1];
        baskets[i - 1] = baskets[j - 1];
        baskets[j - 1] = tmp;
    }
    for (int & ball : baskets) cout << ball << ' ';
}