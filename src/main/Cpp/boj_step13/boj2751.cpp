#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    int N;
    cin >> N;
    vector<int> V(N);

    for (int& i : V)
        cin >> i;

    sort(V.begin(), V.end());

    for (int& i : V)
        cout << i << '\n';
}