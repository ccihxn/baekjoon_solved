#include <iostream>
#include <unordered_set>
#include <string>
using namespace std;

int main() {
    int N;
    cin >> N;
    cin.ignore();
    int cnt = 0;
    for (int k = 0; k < N; ++k) {
        bool is_group = true;
        unordered_set<char> key_set;
        string s;
        cin >> s;
        for (int i = 0; i < s.length(); ++i) {
            if (key_set.find(s[i]) != key_set.end() && s[i - 1] != s[i]) {
                is_group = false;
                break;
            }
            key_set.insert(s[i]);
        }
        if (is_group) cnt++;
    }
    cout << cnt << endl;
}