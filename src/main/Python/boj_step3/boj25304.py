import sys
cin = sys.stdin.readline

X = int(cin())
N = int(cin())
total = 0
for _ in range(N):
    a, b = map(int, cin().split())
    total += a * b
print ('Yes' if X == total else 'No')