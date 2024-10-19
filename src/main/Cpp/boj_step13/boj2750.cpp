#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> vect(N);

    for (int & i : vect)
        cin >> i;

    sort(vect.begin(), vect.end());

    for (int & i : vect)
        cout << i << endl;
}