import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
L = {}
for id in range(1, N + 1):
    name = cin().strip()
    L[str(id)] = name
    L[name] = id
    id += 1
for _ in range(M):
    print(L.get(cin().strip()))