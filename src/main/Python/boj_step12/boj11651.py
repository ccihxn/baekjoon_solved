import sys
cin = sys.stdin.readline

N = int(cin())
L = []
for _ in range(N):
    x, y = map(int, cin().split())
    L.append((x, y))
L.sort(key=lambda point: (point[1], point[0]))
for point in L:
    print(f'{point[0]} {point[1]}')