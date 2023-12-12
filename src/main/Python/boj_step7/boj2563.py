import sys
cin = sys.stdin.readline

P = [[False] * 100 for _ in range(100)]
for _ in range(int(cin())):
    x, y = map(int, cin().split())
    for i in range(10):
        for j in range(10):
            P[x + i][y + j] = True
print(sum(row.count(True) for row in P))