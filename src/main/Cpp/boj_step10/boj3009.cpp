#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<int> xList(3);
    vector<int> yList(3);

    for (int i = 0; i < 3; ++i) {
        cin >> xList[i] >> yList[i];
    }

    auto find_unique = [](vector<int>& list) -> int {
        for (int i = 0; i < list.size(); ++i) {
            if (count(list.begin(), list.end(), list[i]) == 1) {
                return list[i];
            }
        }
        return -1;
    };

    int x = find_unique(xList);
    int y = find_unique(yList);

    cout << x << " " << y << endl;

    return 0;
}
