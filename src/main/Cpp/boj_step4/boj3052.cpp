#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

int main() {
    array<int, 42> list = {0};
    for (int i = 0; i < 10; i++) {
        int n;
        cin >> n;
        list[n % 42]++;
    }
    cout << count_if(list.begin(), list.end(), [](int x) {
       return x != 0;
    });
}