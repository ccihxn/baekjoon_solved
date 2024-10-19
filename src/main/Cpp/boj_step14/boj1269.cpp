#include <iostream>
#include <set>
#include <algorithm>
#include <iterator>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int A_size, B_size, num;
    cin >> A_size >> B_size;
    set<int> A;
    set<int> B;
    set<int> intersection;

    for (int i = 0; i < A_size; i++) {
        cin >> num;
        A.insert(num);
    }

    for (int i = 0; i < B_size; i++) {
        cin >> num;
        B.insert(num);
    }

    set_intersection(A.begin(), A.end(), B.begin(), B.end(), inserter(intersection, intersection.begin()));

    cout << A.size() + B.size() - intersection.size() * 2;
}