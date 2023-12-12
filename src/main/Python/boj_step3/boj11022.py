import sys
cin = sys.stdin.readline

T = int(cin())
for i in range(T):
    a, b = map(int, cin().split())
    print(f'Case #{i + 1}: {a} + {b} = {a + b}')