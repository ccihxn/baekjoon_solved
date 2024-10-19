#include <iostream>
#include <stack>
#include <algorithm>
#include <numeric>
using namespace std;

int main() {
    int K, res = 0;
    cin >> K;
    stack<int> book;

    for (int i = 0; i < K; i++) {
        int money;
        cin >> money;
        if (money == 0) book.pop();
        else book.push(money);
    }

    while (!book.empty()) {
        res += book.top();
        book.pop();
    }

    cout << res;
}