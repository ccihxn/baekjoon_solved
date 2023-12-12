import sys
cin = sys.stdin.readline

A = [''] * 5
for i in range(5):
    A[i] = cin().strip()
for j in range(15):
    for i in range(len(A)):
        if j < len(A[i]):
            print(A[i][j], end='')