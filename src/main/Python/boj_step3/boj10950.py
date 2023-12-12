import sys
cin = sys.stdin.readline

T = int(cin())
for _ in range(T):
    print(sum(map(int, cin().split())))