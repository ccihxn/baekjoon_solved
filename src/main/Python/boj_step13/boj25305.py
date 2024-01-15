import sys
cin = sys.stdin.readline

N, k = map(int, cin().split())
A = sorted(map(int, cin().split()))
print(A[N - k])