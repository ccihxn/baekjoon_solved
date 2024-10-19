#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    set<string> words_set;

    for (int i = 0; i < N; i++) {
        string s;
        cin >> s;
        words_set.insert(s);
    }

    vector<string> words(words_set.begin(), words_set.end());

    sort(words.begin(), words.end(), [] (string& a, string& b) {
        if (a.size() == b.size())
            return a < b;

    return a.size() < b.size();
});

    for (const auto& word: words)
        cout << word << '\n';
}