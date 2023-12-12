import sys

h, m = map(int, sys.stdin.readline().split())
time = int(sys.stdin.readline())
h += time // 60
m += time % 60
if m >= 60:
    h += 1
    m %= 60
if h >= 24: h %= 24
print(h, m)