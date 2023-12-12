import sys
cin = sys.stdin.readline

croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
s = cin().strip()
for c in croatia:
    s = s.replace(c, 'A')
print(len(s))