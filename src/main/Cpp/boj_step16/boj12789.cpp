#include <iostream>
#include <stack>
#include <queue>
using namespace std;

int main() {
    queue<int> line;
    stack<int> spare;
    int res = 1;
    int N;
    cin >> N;

    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;
        line.push(num);
    }

    while (true) {
        if (line.empty() && spare.empty()) {
            cout << "Nice";
            break;
        }

        if (spare.empty()) {
            if (line.front() != res)
                spare.push(line.front());
            else
                res++;

            line.pop();
        } else if (line.empty()) {
            if (spare.top() != res) {
                cout << "Sad";
                break;
            }

            spare.pop();
            res++;
        } else {
            if (line.front() != res && spare.top() != res) {
                spare.push(line.front());
                line.pop();
            } else if (line.front() == res) {
                line.pop();
                res++;
            } else if (spare.top() == res) {
                spare.pop();
                res++;
            }
        }
    }
}