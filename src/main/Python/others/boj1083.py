import sys
cin = sys.stdin.readline

N = int(cin())
A = list(map(int, cin().split()))
S = int(cin())
for i in range(0, S * 2, 2):
    if i + 1 >= N: i %= N
    if A[i] < A[i + 1]:
        A[i], A[i + 1] = A[i + 1], A[i]
print(*A)