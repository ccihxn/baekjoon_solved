import sys
cin = sys.stdin.readline
A = sorted(list(map(int, list(cin().strip()))), reverse = True)
for n in A: print(n, end='')