import sys
cin = sys.stdin.readline

A, B, V = map(int, cin().split())
if (V - A) % (A - B) == 0: print((V - A) // (A - B) + 1)
else: print((V - A) // (A - B) + 2)