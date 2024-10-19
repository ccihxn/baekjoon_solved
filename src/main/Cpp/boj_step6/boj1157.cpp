#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main() {
    string s;
    cin >> s;
    array<int, 26> cnt = { 0 };
    for (char & c : s) {
        c = toupper(c);
        cnt[c - 'A']++;    
    }
    int max_count = *max_element(cnt.begin(), cnt.end());
    if(count(cnt.begin(), cnt.end(), max_count) > 1)
        cout << '?';
    else
        for (int i = 0; i < cnt.size(); i++)
            if (cnt[i] == max_count) {
                cout << (char) (i + 'A');
                break;
            }
}