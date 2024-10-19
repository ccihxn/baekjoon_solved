#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> list;
    int N, K;
    cin >> N >> K;

    for (int i = 1; i <= N; i++)
        list.push(i);

    cout << "<";

    while (!list.empty()) {
        for (int i = 1; i < K; i++) {
            list.push(list.front());
            list.pop();
        }

        if (list.size() == 1)
            cout << list.front() << ">";
        else
            cout << list.front() << ", ";
        list.pop();
    }
}