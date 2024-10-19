#include <iostream>
#include <vector>
#include <map>
using namespace std;

int main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);

    int N, M;
    cin >> N;
    vector<int> deck(N);
    map<int, int> key_deck;
    vector<int> order;

    for (auto& card : deck)
        cin >> card;

    cin >> M;

    for (int i = 0; i < M; i++) {
        int card;
        cin >> card;
        key_deck[card] = 0;
        order.push_back(card);
    }

    for (auto& card : deck)
        if (key_deck.find(card) != key_deck.end())
            key_deck[card]++;

    for (const auto& card : order)
        cout << key_deck[card] << ' ';
}