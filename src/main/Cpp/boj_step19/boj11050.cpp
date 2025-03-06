#include <iostream>
using namespace std;

int main()
{
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N, K, A = 1, B = 1;
    cin >> N >> K;

    for (int i = 0; i < K; i++)
    {
        A *= N - i;
        B *= i + 1;
    }

    cout << A / B;
}