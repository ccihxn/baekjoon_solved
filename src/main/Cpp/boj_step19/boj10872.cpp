#include <iostream>
#include <functional>
using namespace std;

int main()
{
    int N;
    cin >> N;

    function<int(int)> fact = [&] (int N) -> int
    {
        if (N <= 1) return 1;
        return N * fact(N - 1);
    };

    cout << fact(N);
}