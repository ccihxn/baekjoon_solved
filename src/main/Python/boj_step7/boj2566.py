import sys
cin = sys.stdin.readline

M = -1
row = 0
column = 0
for i in range(9):
    A = list(map(int, cin().split()))
    if max(A) > M:
        M = max(A)
        row = i + 1
        column = A.index(max(A)) + 1
print(M)
print(row, column)