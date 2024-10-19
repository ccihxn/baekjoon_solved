#include <iostream>
#include <stack>
#include <functional>
using namespace std;

int main() {
    function isVPS = [&](stack<char> st, string s) -> string {
        for (const auto & c : s) {
            if (c == '(' || c == '[')
                st.push(c);
            else if (c == ')') {
                if (st.empty() || st.top() == '[')
                    return "no";

                st.pop();
            } else if (c == ']') {
                if (st.empty() || st.top()== '(')
                    return "no";

                st.pop();
            }
        }

        return (st.empty()) ? "yes" : "no";
    };

    string s;
    stack<char> st;
    while (getline(cin, s) && s != ".") {
        cout << isVPS(st, s) << endl;
    }
}