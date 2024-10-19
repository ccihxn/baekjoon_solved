#include <iostream>
#include <queue>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    queue<int> q;
    string command;

    for (int i = 0; i < N; i++) {
        cin >> command;

        if (command == "push") {
            int data;
            cin >> data;
            q.push(data);
        }

        if (command == "pop") {
            if (q.empty())
                cout << "-1" << '\n';
            else {
                cout << q.front() << '\n';
                q.pop();
            }
        }

        if (command == "size")
            cout << q.size() << '\n';


        if (command == "empty")
            cout << q.empty() << '\n';

        if (command == "front") {
            if (q.empty())
                cout << "-1" << '\n';
            else
                cout << q.front() << '\n';
        }

        if (command == "back") {
            if (q.empty())
                cout << "-1" << '\n';
            else
                cout << q.back() << '\n';
        }
    }
}