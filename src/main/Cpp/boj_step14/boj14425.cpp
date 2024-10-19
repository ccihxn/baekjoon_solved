#include <iostream>
#include <set>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    set<string> S;

    for (int i = 0; i < N; i++) {
        string s;
        cin >> s;
        S.insert(s);
    }

    int res = 0;

    for (int i = 0; i < M; i++) {
        string s;
        cin >> s;

        if (S.find(s) != S.end())
            res++;
    }

    cout << res;
}