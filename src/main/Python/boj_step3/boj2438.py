import sys
cin = sys.stdin.readline

N = int(cin())
for i in range(N):
    for j in range(i + 1):
        print('*', end='')
    print()