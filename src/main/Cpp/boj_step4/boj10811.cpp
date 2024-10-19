#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<int> baskets(N);
    iota(baskets.begin(), baskets.end(), 1);
    for (int _ = 0; _ < M; _++) {
        int i, j;
        cin >> i >> j;
        reverse(baskets.begin() + i - 1, baskets.begin() + j);
    }
    for (int & ball : baskets)
        cout << ball << ' ';
}