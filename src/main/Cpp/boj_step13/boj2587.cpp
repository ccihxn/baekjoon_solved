#include <iostream>
#include <array>
#include <algorithm>
#include <numeric>
using namespace std;

int main() {
    array<int, 5> arr{};

    for (int &i : arr)
        cin >> i;

    sort(arr.begin(), arr.end());

    cout << accumulate(arr.begin(), arr.end(), 0) / 5 << endl
    << arr[2];
}