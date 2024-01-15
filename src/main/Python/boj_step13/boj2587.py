import sys
cin = sys.stdin.readline

A = []
for _ in range(5):
    A.append(int(cin()))
A = sorted(A)
print(sum(A) // 5)
print(A[2])