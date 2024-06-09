#include <iostream>
using namespace std;

int main() {
    int A, B;
    string result;
    cin >> A >> B;
    if (A > B) result = ">";
    else if (A < B) result = "<";
    else result = "==";
    cout << result;
}