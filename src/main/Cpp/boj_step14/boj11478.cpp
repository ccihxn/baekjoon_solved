#include <iostream>
#include <unordered_set>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    unordered_set<string> set;
    string s;
    cin >> s;

    for (int i = 0; i < s.size(); i++)
        for (int j = 0; j < s.size() - i; j++)
            set.insert(s.substr(j, i + 1));

    cout << set.size();
}