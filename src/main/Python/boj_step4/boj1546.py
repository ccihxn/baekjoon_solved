import sys
cin = sys.stdin.readline

N = int(cin())
A = list(map(int, cin().split()))
print(sum(A) /max(A) * 100 / N)