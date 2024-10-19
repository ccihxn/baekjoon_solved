#include <iostream>
#include <list>
using namespace std;

int main() {
    int N;
    cin >> N;
    string key = "666";
    list<string> res;

    for (int i = 0; i < N; i++)
        res.push_back(to_string(i) + key);

    cout << res.back;
}