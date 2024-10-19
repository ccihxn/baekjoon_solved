#include <iostream>
#include <array>
using namespace std;

int main() {
    array<string, 8> croa = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
    string s;
    cin >> s;
    for (string &key : croa) {
        size_t pos = 0;
        while ((pos = s.find(key, pos)) != string::npos)
            s.replace(pos, key.size(), "A");
    }
    cout << s.size();
}