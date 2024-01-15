import sys
cin = sys.stdin.readline

N = int(cin())
L = list(map(int, cin().split()))
M = int(cin())
keys = list(map(int, cin().split()))
K = dict.fromkeys(keys, 0)
for card in L:
    if card in K:
        K[card] += 1
for key in keys:
    print(K[key], end=' ')