#include <iostream>
#include <deque>
using namespace std;

template <typename T1, typename T2> class Pair {
    T1 idx;
    T2 nextPos;

public:
    Pair(T1 idx, T2 nextPos) : idx(idx), nextPos(nextPos) {}

    [[nodiscard]] T1 index() const {
        return idx;
    }

    [[nodiscard]] T2 next() const {
        return nextPos;
    }
};

int main() {
    int N;
    cin >> N;
    deque<Pair<int, int>> balloons;
    for (int i = 1; i <= N; i++) {
        int next;
        cin >> next;
        balloons.emplace_back(i, next);
    }

    while (!balloons.empty()) {
        Pair tmp = balloons.front();
        balloons.pop_front();
        cout << tmp.index() << ' ';
        if (!balloons.empty()) {
            if (tmp.next() > 0)
                for (int i = 0; i < tmp.next() - 1; i++) {
                    balloons.push_back(balloons.front());
                    balloons.pop_front();
                }
            else
                for (int i = 0; i < abs(tmp.next()); i++) {
                    balloons.push_front(balloons.back());
                    balloons.pop_back();
                }
        }
    }
}