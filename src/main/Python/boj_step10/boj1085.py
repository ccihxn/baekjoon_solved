import sys
cin = sys.stdin.readline

x, y, w, h = map(int, cin().split())
print(min(min(w - x, x - 0), min(h - y, y - 0)))