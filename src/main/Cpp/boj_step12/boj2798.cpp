#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, M, res = 0;
    cin >> N >> M;
    vector<int> cards(N);

    for (int &card : cards)
        cin >> card;

    for (int i = 0; i < cards.size() - 2; i++)
        for (int j = i + 1; j < cards.size() - 1; j++)
            for (int k = j + 1; k < cards.size(); k++)
                if (cards[i] + cards[j] + cards[k] > res && cards[i] + cards[j] + cards[k] <= M)
                    res = cards[i] + cards[j] + cards[k];

    cout << res;
}