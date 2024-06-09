#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> arr(N);
    for (int & i : arr) cin >> i;
    cout << *min_element(arr.begin(), arr.end()) << " " << *max_element(arr.begin(), arr.end());
}