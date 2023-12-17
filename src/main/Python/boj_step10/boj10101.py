import sys
cin = sys.stdin.readline

a = int(cin())
b = int(cin())
c = int(cin())
if a == b == c == 60: print('Equilateral')
elif a + b + c == 180:
    if a == b or b == c or a == c: print('Isosceles')
    else: print('Scalene')
else: print('Error')