import math
import sys
cin = sys.stdin.readline

dots = 2
for _ in range(int(cin())):
    dots = dots * 2 - 1
print(dots ** 2)