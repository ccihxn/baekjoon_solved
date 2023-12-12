import sys
cin = sys.stdin.readline

units = [25, 10, 5]
for _ in range(int(cin())):
    C = int(cin())
    for unit in units:
        print(C // unit, end=' ')
        C %= unit
    print(C)