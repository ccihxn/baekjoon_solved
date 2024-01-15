import sys
cin = sys.stdin.readline

N = int(cin())
S = list(dict.fromkeys(map(int, cin().split())))
M = int(cin())
keyS = list(dict.fromkeys(map(int, cin().split())))
for key in keyS:
    print(1 if key in S else 0, end=' ')