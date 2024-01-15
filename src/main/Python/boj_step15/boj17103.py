import sys
cin = sys.stdin.readline

T = int(cin())
isP = [True] * 1_000_001
P = []
isP[1] = False
for i in range(2, 1_000_001):
    if not isP[i]: continue
    P.append(i)
    for j in range(i * 2, 1_000_001, i):
        isP[j] = False
for _ in range(T):
    N = int(cin())
    C = 0
    for x in P:
        if x > N / 2: break
        if isP[N - x]: C += 1
    print(C)