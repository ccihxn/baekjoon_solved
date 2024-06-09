#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main() {
    array<int, 9> arr;
    for (int & i : arr) cin >> i;
    cout << *max_element(arr.begin(), arr.end()) << endl
    << max_element(arr.begin(), arr.end()) - arr.begin() + 1;
}