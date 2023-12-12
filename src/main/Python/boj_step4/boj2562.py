import sys
cin = sys.stdin.readline

A = [0] * 9
for i in range(9):
    A[i] = int(cin())
print(max(A))
print(A.index(max(A)) + 1)