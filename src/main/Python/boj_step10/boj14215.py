import sys
cin = sys.stdin.readline

a, b, c = map(int, cin().split())
M = max(a, max(b, c))
if M * 2 >= a + b + c: print((a + b + c - M) * 2 - 1)
else: print(a + b + c)