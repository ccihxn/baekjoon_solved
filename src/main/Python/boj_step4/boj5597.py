import sys
cin = sys.stdin.readline

L = list(range(1, 31))
for _ in range(28):
    L.remove(int(cin()))
for x in L: print(x)