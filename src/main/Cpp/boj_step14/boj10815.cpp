#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int binarySearch(vector<int>& V, int target, int start, int end) {
    while (start <= end) {
        int mid = (start + end) / 2;

        if (V.at(mid) == target)
            return mid;
        else if (V.at(mid) > target)
            end = mid - 1;
        else
            start = mid + 1;
    }

    return -1;
}

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N, M;
    cin >> N;
    vector<int> deck(N);

    for (auto& card : deck)
        cin >> card;

    sort(deck.begin(), deck.end());
    cin >> M;

    for (int i = 0; i < M; i++) {
        int card;
        cin >> card;
        cout << (binarySearch(deck, card, 0, N - 1) != -1 ? 1 : 0) << ' ';
    }
}