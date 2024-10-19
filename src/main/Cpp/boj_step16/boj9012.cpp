#include <iostream>
#include <stack>
#include <functional>
using namespace std;

int main() {
    function isVPS = [&] (stack<char> st, string ps) -> string {
        for (const auto & p : ps) {
            if (p == '(')
                st.push(p);
            else {
                if (st.empty())
                    return "NO";

                st.pop();
            }
        }

        return (st.empty()) ? "YES" : "NO";
    };

    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        stack<char> st;
        string ps;
        cin >> ps;
        cout << isVPS(st, ps) << endl;
    }
}