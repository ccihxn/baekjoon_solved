#include <iostream>
using namespace std;

int main() {
    int T, i = 0;
    cin >> T;
    while (i++ != T) {
        int R;
        string S, P;
        cin >> R >> S;
        for (char & c: S)
            for(int index = 0; index < R; index++)
                P.push_back(c);
        cout << P << endl;
    }
}