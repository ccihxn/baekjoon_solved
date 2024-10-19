#include <iostream>
using namespace std;

int main() {
    int x, y, w, h;
    cin >> x >> y >> w >> h;
    int width = (w - x) < x ? (w - x) : x;
    int height = (h - y) < y ? (h - y) : y;
    cout << min(width, height);
}