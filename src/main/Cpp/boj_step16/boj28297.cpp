#include <iostream>
#include <deque>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    deque<int> d;
    int N, command, data;
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> command;

        switch (command) {
            case 1:
                cin >> data;
            d.push_front(data);
            break;

            case 2:
                cin >> data;
            d.push_back(data);
            break;

            case 3:
                if (d.empty())
                    cout << "-1" << '\n';
                else {
                    cout << d.front() << '\n';
                    d.pop_front();
                } break;

            case 4:
                if (d.empty())
                    cout << "-1" << '\n';
                else {
                    cout << d.back() << '\n';
                    d.pop_back();
                } break;

            case 5:
                cout << d.size() << '\n';
            break;

            case 6:
                cout << d.empty() << '\n';
            break;

            case 7:
                if (d.empty())
                    cout << "-1" << '\n';
                else
                    cout << d.front() << '\n';
            break;

            case 8:
                if (d.empty())
                    cout << "-1" << '\n';
                else
                    cout << d.back() << '\n';
            break;
        }
    }
}