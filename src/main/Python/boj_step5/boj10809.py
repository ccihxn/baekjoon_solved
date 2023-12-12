import sys
cin = sys.stdin.readline

A = [-1] * 26
s = cin().strip()
for i, c in enumerate(s):
    if A[ord(c) - ord('a')] == -1:
        A[ord(c) - ord('a')] = i
for n in A: print(n, end=' ')