import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
A = [ [] for _ in range(N) ]
for i in range(N):
    A[i] = list(map(int, cin().split()))
for i in range(N):
    B = list(map(int, cin().split()))
    for j in (range(M)):
        A[i][j] += B[j]
        print(A[i][j], end=' ')
    print()