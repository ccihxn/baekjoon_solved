import sys
cin = sys.stdin.readline

n = int(cin())
cnt = 0
L = [ [] for _ in range(1, n + 1) ]
visited = [False] * (n + 1)

for i in range (1, int(cin()) + 1):
    x, y = map(int, cin().split())
    L[x].append(y)
    L[y].append(x)

def dfs(num):
    if visited[num]: return
    visited[num] = True
    cnt += 1
    L[num].foreach(lambda x:dfs(x))

dfs(1)