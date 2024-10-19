#include <iostream>
#include <array>
using namespace std;

int main() {
    string s;
    array<int, 26> alphabet;
    fill(alphabet.begin(), alphabet.end(), -1);
    cin >> s;
    for (int i = 0; i < s.size(); i++)
        if (alphabet[s[i] - 'a'] == -1)
            alphabet[s[i] - 'a'] = i;
    for (int & i: alphabet) cout << i << ' ';
}