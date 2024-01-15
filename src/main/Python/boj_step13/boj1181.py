import sys
cin = sys.stdin.readline

N = int(cin())
S = set()
for _ in range(N):
    S.add(cin().strip())
L = sorted(S, key=lambda x: (len(x), x))
for s in L: print(s)