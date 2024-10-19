#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);
    
    int N;
    cin >> N;
    vector<pair<int, int>> coordinates(N);

    for (auto& coordinate: coordinates) {
        int x, y;
        cin >> x >> y;
        coordinate = { x, y };
    }

    sort (coordinates.begin(), coordinates.end(), [] (pair<int, int>&  a, pair<int, int>& b) {
        if (a.second == b.second)
            return a.first < b.first;
        return a.second < b.second;
    });

    for (const auto& coordinate: coordinates)
        cout << coordinate.first << ' ' << coordinate.second << '\n';
}