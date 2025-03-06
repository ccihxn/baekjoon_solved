#include <iostream>
#include <functional>
using namespace std;

int main()
{
    int T;
    cin >> T;

    for (int i = 0; i < T; i++)
    {
        int N, M;
        cin >> N >> M;
        unsigned long long res = 1;

        if (N > M - N)
            N = M - N;

        for (int i = 0; i < N; i++)
        {
            res *= M - i;
            res /= i + 1;
        }

        cout << res << endl;
    }
}