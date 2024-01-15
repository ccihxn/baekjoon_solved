import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
A = set()
result = []

for _ in range(N):
    A.add(cin().strip())
for _ in range(M):
    s = cin().strip()
    if s in A and s not in result: result.append(s)
result.sort()
print(len(result))
print('\n'.join(result))