#include <iostream>
#include <map>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N, M;
    cin >> N >> M;
    map<string, string> dict;
    int id = 1;


    for (int i = 0; i < N; i++) {
        string name;
        cin >> name;
        dict[name] = to_string(id);
        dict[to_string(id++)] = name;
    }

    for (int i = 0; i < M; i++) {
        string key;
        cin >> key;
        cout << dict[key] << '\n';
    }
}