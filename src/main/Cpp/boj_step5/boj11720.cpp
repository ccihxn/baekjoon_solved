#include <iostream>
#include <numeric>
using namespace std;

int main() {
    int N;
    string s;
    cin >> N >> s;
    cout << accumulate(s.begin(), s.end(), 0) - '0' * N;
}