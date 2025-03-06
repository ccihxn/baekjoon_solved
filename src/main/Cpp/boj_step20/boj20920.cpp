#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    int N, M;
    cin >> N >> M;

    unordered_map<string, int> freq;
    vector<string> words;

    for (int i = 0; i < N; i++)
    {
        string word;
        cin >> word;

        if (static_cast<int>(word.length()) >= M)
            if (freq[word]++ == 0)
                words.push_back(word);
    }

    auto cmp = [&](const string &a, const string &b)
    {
        if (freq[a] != freq[b])
            return freq[a] > freq[b];

        if (a.length() != b.length())
            return a.length() > b.length();

        return a < b;
    };

    sort(words.begin(), words.end(), cmp);

    for (const auto &word : words)
        cout << word << '\n';
}