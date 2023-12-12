import sys
from sympy import isprime
cin = sys.stdin.readline

N = int(cin())
A = list(map(int, cin().split()))
cnt = 0
for n in A:
    if isprime(n): cnt += 1
print(cnt)