import sys
cin = sys.stdin.readline

T = int(cin())
for i in range(T):
    print(f'Case #{i + 1}: {sum(map(int, cin().split()))}')