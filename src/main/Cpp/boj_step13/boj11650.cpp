#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    vector<pair<int, int>> coordinates(N);

    for (int i = 0; i < N; i++) {
        int x, y;
        cin >> x >> y;
        coordinates.at(i) = { x, y };
    }

    sort(coordinates.begin(), coordinates.end(), [] (pair<int ,int>& a, pair<int, int> b) {
       if (a.first == b.first)
           return a.second < b.second;
        return a.first < b.first;
    });

    for (const auto& coordinate : coordinates)
        cout << coordinate.first << ' ' << coordinate.second << '\n';
}