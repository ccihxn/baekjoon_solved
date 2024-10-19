#include <functional>
#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    vector<int> trees(N);
    vector<int> interval;

    for (int i = 0; i < N; i++) {
        cin >> trees[i];
        if (i != 0)
            interval.push_back(trees[i] - trees[i - 1]);
    }

    function<int(int, int)> gcd = [&](int a, int b) -> int {
        return (b != 0) ? gcd(b, a % b) : a;
    };

    int min_interval = reduce(interval.begin(), interval.end(), 0, gcd), res = 0;

    for (int i = 0; i < interval.size(); i++)
        res += interval[i] / min_interval - 1;

    cout << res;
}