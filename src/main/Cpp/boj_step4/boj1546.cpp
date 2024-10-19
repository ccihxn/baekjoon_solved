#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int main() {
    double N;
    cin >> N;
    vector<double> test(N);
    for (int i = 0; i < N; i++) cin >> test[i];
    int max_score = *max_element(test.begin(), test.end());
    for (double & score : test)
        score = score / max_score * 100;
    cout << accumulate(test.begin(), test.end(), 0.0) / N;
}