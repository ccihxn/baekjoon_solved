#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<vector<char>> chess(N, vector<char>(M));

    for (auto &row : chess)
        for (char & c : row)
            cin >> c;

}