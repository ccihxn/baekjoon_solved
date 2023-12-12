import sys
cin = sys.stdin.readline

N = int(cin())
for i in range(N):
    for j in range(i, N - 1): print(end=' ')
    for j in range(i + 1): print('*', end='')
    for j in range(i): print('*', end='')
    print()
for i in range(N - 1):
    for j in range(i + 1): print(end=' ')
    for j in range(i, N - 1): print('*', end='')
    for j in range(i, N - 2): print('*', end='')
    print()