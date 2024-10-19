#include <iostream>
#include <list>
#include <numeric>
using namespace std;

int main() {
    list<int> factors;
    int n;
    cin >> n;

    while (n != -1) {
        for (int devisor = 1; devisor <= n / 2; devisor++)
            if (n % devisor == 0)
                factors.push_back(devisor);
        if (n == accumulate(factors.begin(), factors.end(), 0)) {
            cout << n << " = ";
            for (size_t i = 0; i < factors.size(); ++i) {
                if (i > 0) cout << " + ";
                cout << factors.front();
                factors.pop_front();
            }
            cout << endl;
        } else
            cout << n << " is NOT perfect." << endl;
    }
}