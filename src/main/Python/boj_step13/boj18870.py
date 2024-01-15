import sys
cin = sys.stdin.readline

N = int(cin())
L = list(map(int, cin().split()))
sortedL = sorted(L)
M = {}
v = 0
for key in sortedL:
    if key not in M:
        M[key] = v
        v += 1
for it in L:
    print(M.get(it), end=' ')
