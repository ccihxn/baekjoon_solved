import sys
cin = sys.stdin.readline

N = int(cin())
A = []
for _ in range(N):
    A.append(int(cin()))
A = sorted(A)
for n in A: print(n)