#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    string s;
    cin >> s;
    vector<int> V;

    for (auto& c : s)
        V.push_back(c - '0');

    sort(V.begin(), V.end(), [](int a, int b) { return a > b; });

    for (auto& i : V)
        cout << i;
}