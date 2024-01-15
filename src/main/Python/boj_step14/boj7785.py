import sys
cin = sys.stdin.readline

n = int(cin())
S = set()
for _ in range(n):
    name, clock = cin().split()
    S.add(name) if clock == 'enter' else S.remove(name)
L = list(sorted(S, reverse = True))
for name in L: print(name)