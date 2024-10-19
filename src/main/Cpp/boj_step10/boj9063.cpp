#include <iostream>
#include <list>
#include <algorithm>
using namespace std;

int main() {
    int N;
    list<int> xList;
    list<int> yList;

    cin >> N;

    for (int i = 0; i < N; i++) {
        int x, y;
        cin >> x >> y;
        xList.push_back(x);
        yList.push_back(y);
    }

    int width = *max_element(xList.begin(), xList.end()) - *min_element(xList.begin(), xList.end()),
    height = *max_element(yList.begin(), yList.end()) - *min_element(yList.begin(), yList.end());

    cout << width * height;
}