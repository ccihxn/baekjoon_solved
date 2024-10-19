#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main() {
    array<array<int, 9>, 9> arr;
    int max = 0, posx = 0, posy = 0;

    for (auto & i : arr)
        for (auto & j : i)
            cin >> j;

    for (int i = 0; i < arr.size(); i++)
        for (int j = 0; j < arr[i].size(); j++)
            if (arr[i][j] >= max) {
                max = arr[i][j];
                posy = i + 1;
                posx = j + 1;
            }

    cout << max << endl << posy << ' ' << posx;
}