#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N, v;
    cin >> N;
    vector<int> arr(N);
    for (int i = 0; i < arr.size(); i++) cin >> arr[i];
    cin >> v;
    cout << count(arr.begin(), arr.end(), v);
}