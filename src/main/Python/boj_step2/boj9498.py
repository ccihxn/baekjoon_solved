import sys

print({ 10 : 'A',
        9 : 'A',
        8 : 'B',
        7 : 'C',
        6 : 'D'}.get(int(sys.stdin.readline()) // 10, 'F'))