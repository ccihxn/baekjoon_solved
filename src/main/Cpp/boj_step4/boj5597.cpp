#include <iostream>
#include <array>
using namespace std;

int main() {
    array<int, 30> list;
    for (int i = 0; i < list.size() - 2; i++) {
        int key;
        cin >> key;
        list[key]++;
    }
    for (int i = 0; i < list.size(); i++)
        if (list[i] == 0) cout << i << endl;
}