#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main() {
    array<array<bool, 101>, 101> paper{};
    int n;
    cin >> n;

    for (int _ = 0; _ < n; _++) {
        int x, y;
        cin >> x >> y;

        for (int i = y; i < y + 10; i++)
            for (int j = x; j < x + 10; j++)
                paper[i][j] = true;
    }
    array<bool, 101 * 101> flat_paper{};
    int pos = 0;

    for (auto & i : paper)
        for (bool j : i)
            flat_paper[pos++] = j;

    cout << count(flat_paper.begin(), flat_paper.end(), true);
}