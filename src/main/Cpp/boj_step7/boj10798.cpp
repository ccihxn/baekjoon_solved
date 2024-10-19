#include <iostream>
#include <array>
#include <cstring>
#include <limits>
using namespace std;

int main() {
    array<array<char, 15>, 5> arr{};
    for (auto & i : arr) {
        string s;
        cin >> s;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        if (s.size() > i.size()) return 0;
        strcpy(i.data(), s.c_str());
    }

    for (size_t j = 0; j < arr[0].size(); j++)
        for (auto & i : arr)
            if (i[j] != '\0')
                cout << i[j];
}