#include <iostream>
#include <unordered_set>
#include <set>
#include <vector>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N, M;
    cin >> N >> M;
    unordered_set<string> no_listens;
    set<string> list;

    for (int i = 0; i < N; i++) {
        string no_listen;
        cin >> no_listen;
        no_listens.insert(no_listen);
    }

    for (int i = 0; i < M; i++) {
        string no_look;
        cin >> no_look;
        if (no_listens.find(no_look) != no_listens.end())
            list.insert(no_look);
    }

    cout << list.size() << '\n';

    for (const auto& name : list)
        cout << name << '\n';

}