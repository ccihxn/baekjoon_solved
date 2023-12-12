import sys
cin = sys.stdin.readline

N, X = map(int, cin().split())
L = list(map(int, cin().split()))
result = list(filter(lambda x: x < X, L))
for x in result: print(x, end=' ')