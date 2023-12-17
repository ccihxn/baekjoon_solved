import sys
cin = sys.stdin.readline

while True:
    a, b, c = map(int, cin().split())
    if a == b == c == 0: exit()
    M = max(a, max(b, c))
    if M * 2 >= a + b + c: print('Invalid')
    else:
        if a == b == c: print('Equilateral')
        elif a == b or b == c or a == c: print('Isosceles')
        else: print('Scalene')