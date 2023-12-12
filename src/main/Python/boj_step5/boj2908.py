import sys
cin = sys.stdin.readline

A, B = cin().split()
print(max(int(''.join(reversed(A))), int(''.join(reversed(B)))))