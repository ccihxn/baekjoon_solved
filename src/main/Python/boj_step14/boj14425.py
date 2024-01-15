import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
S = set()
cnt = 0
for _ in range(N):
    S.add(cin().strip())
for _ in range(M):
    if cin().strip() in S: cnt += 1
print(cnt)