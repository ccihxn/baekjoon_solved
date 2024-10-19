#include <iostream>
#include <vector>
using namespace std;

int main() {
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    vector<int> count(10'001);

    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;
        count.at(num)++;
    }

    for (int i = 0; i < 10'001; i++) {
        while (count.at(i)--)
            cout << i << '\n';
    }
}