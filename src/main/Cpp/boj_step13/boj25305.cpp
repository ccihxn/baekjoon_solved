#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N, k;
    cin >> N >> k;
    vector<int> scores(N);

    for (int &i : scores)
        cin >> i;

    sort(scores.begin(), scores.end(), greater<>());
    cout << scores[--k];
}