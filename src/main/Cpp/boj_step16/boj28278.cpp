#include <iostream>
#include <stack>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    stack<int> st;

    for (int i = 0; i < N; i++) {
        int command;
        cin >> command;

        switch (command) {
            case 1:
                int data;
            cin >> data;
            st.push(data);
            break;

            case 2:
                if (st.empty())
                    cout << -1 << '\n';
                else {
                    cout << st.top() << '\n';
                    st.pop();
                }
            break;

            case 3:
                cout << st.size() << '\n';
            break;

            case 4:
                cout << st.empty() << '\n';
            break;

            case 5:
                if (st.empty())
                    cout << -1 << '\n';
                else
                    cout << st.top() << '\n';
            break;

            default:
                break;
        }
    }
}