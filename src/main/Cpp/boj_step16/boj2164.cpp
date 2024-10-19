#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> deck;
    int N;
    cin >> N;

    for (int i = 1; i <= N; i++)
        deck.push(i);

    while (deck.size() != 1) {
        deck.pop();
        deck.push(deck.front());
        deck.pop();
    }

    cout << deck.front();
}#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> deck;
    int N;
    cin >> N;

    for (int i = 1; i <= N; i++)
        deck.push(i);

    while (deck.size() != 1) {
        deck.pop();
        deck.push(deck.front());
        deck.pop();
    }

    cout << deck.front();
}