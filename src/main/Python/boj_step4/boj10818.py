import sys
cin = sys.stdin.readline

N = int(cin())
A = list(map(int, cin().split()))
print(min(A), max(A))