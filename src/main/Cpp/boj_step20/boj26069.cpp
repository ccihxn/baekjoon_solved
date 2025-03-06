#include <iostream>
#include <set>
using namespace std;

int main()
{
    int N;
    cin >> N;

    set<string> list;
    list.insert("ChongChong");

    for (int i = 0; i < N; i++) {
        string A, B;
        cin >> A >> B;
        if (list.find(A) != list.end())
            list.insert(B);

        else if (list.find(B) != list.end())
            list.insert(A);
    }

    cout << list.size();
}