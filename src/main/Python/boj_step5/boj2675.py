import sys
from itertools import repeat
cin = sys.stdin.readline

for _ in range(int(cin())):
    n, s = cin().split()
    n = int(n)
    for c in s:
        print(''.join(repeat(c, n)), end='')
    print()