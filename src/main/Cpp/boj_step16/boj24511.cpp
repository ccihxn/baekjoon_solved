#include <iostream>
#include <deque>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> isStack(N);
    deque<int> queuestack;
    for (int i = 0; i < N; i++) {
        int A;
        cin >> A;
        isStack.at(i) = A;
    }

    for (int i = 0; i < N; i++) {
        int B;
        cin >> B;

        if (isStack.at(i) == 0)
            queuestack.push_back(B);
    }

    int M;
    cin >> M;

    for (int i = 0; i < M; i++) {
        int C;
        cin >> C;
        queuestack.push_front(C);
    }

    for (int i = 0; i < M; i++) {
        cout << queuestack.back() << ' ';
        queuestack.pop_back();
    }
}#include <iostream>
#include <deque>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> isStack(N);
    deque<int> queuestack;
    for (int i = 0; i < N; i++) {
        int A;
        cin >> A;
        isStack.at(i) = A;
    }

    for (int i = 0; i < N; i++) {
        int B;
        cin >> B;

        if (isStack.at(i) == 0)
            queuestack.push_back(B);
    }

    int M;
    cin >> M;

    for (int i = 0; i < M; i++) {
        int C;
        cin >> C;
        queuestack.push_front(C);
    }

    for (int i = 0; i < M; i++) {
        cout << queuestack.back() << ' ';
        queuestack.pop_back();
    }
}