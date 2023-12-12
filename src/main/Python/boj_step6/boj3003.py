import sys
cin = sys.stdin.readline

chess = [1, 1, 2, 2, 2, 8]
tmp = list(map(int, cin().split()))
for i, piece in enumerate(chess):
    print(piece - tmp[i], end=' ')