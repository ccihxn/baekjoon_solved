#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, X;
    cin >> N >> X;
    vector<int> arr(N);
    for (int & i : arr) {
        cin >> i;
        if (i < X) cout << i << " ";
    }
}