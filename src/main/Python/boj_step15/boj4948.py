import sys
cin = sys.stdin.readline

while True:
    n = int(cin())
    if n == 0: exit()
    P = [True] * (2 * n + 1)
    P[1] = False
    for i in range(2, 2 * n + 1):
        if not P[i]: continue
        for j in range(i * 2, 2 * n + 1, i):
            P[j] = False
    C = 0
    for i in range(n + 1, n * 2 + 1):
        if P[i]: C += 1
    print(C)