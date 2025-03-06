#include <iostream>
using namespace std;

int main()
{
    int N;
    cin >> N;
    int min = INT32_MAX, max = 0;

    for (int i = 0; i < N; i++)
    {
        int factor;
        cin >> factor;

        if (factor <= min)
            min = factor;

        if (factor >= max)
            max = factor;
    }

    cout << min * max;
}
