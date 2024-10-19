#include <iostream>
#include <set>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);
    int n;
    cin >> n;
    set<string> list;

    for (int i = 0; i < n; i++) {
        string name, commute;
        cin >> name >> commute;

        if (commute == "enter")
            list.insert(name);

        else if (commute == "leave")
            list.erase(name);
    }

    vector listV(list.begin(), list.end());
    sort(listV.begin(), listV.end(), [] (string a, string b) { return a > b; });

    for (auto& name : listV)
        cout << name << '\n';
}