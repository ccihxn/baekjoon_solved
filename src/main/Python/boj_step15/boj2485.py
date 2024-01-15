import sys
from functools import reduce
cin = sys.stdin.readline

def gcd(a, b): return a if b == 0 else gcd(b, a % b)

T = []
N = int(cin())
for _ in range(N): T.append(int(cin()))
D = []
for i in range(N - 1): D.append(T[i + 1] - T[i])
gcd = reduce(lambda acc, i: gcd(acc, i), D)
result = 0
for tmp in D: result += tmp // gcd - 1
print(result)