import sys
cin = sys.stdin.readline

M, N = map(int, cin().split())
P = [True] * 1_000_001
P[0] = False
P[1] = False
for i in range(2, len(P)):
    for j in range(i * 2, len(P), i):
        P[j] = False
for n in range(M, N + 1):
    if P[n]: print(n)