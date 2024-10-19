#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct DATA {
    int id{};
    int age{};
    string name;
};

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N;
    cin >> N;
    vector<DATA> list(N);
    int id{1};

    for (auto& member: list) {
        int age;
        string name;
        cin >> age >> name;
        member.id = id++;
        member.age = age;
        member.name = name;
    }

    sort (list.begin(), list.end(), [] (DATA a, DATA b) {
        if (a.age == b.age)
            return a.id < b.id;

        return a.age < b.age;
    });

    for (const auto& member: list)
        cout << member.age << ' ' << member.name << '\n';
}