import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
L = list(map(int, cin().split()))
r = [0] * M
sum = 0
for i in range(N):
    sum += L[i]
    r[sum % M] += 1
result = r[0]
print(r)
for i in range(M):
    result += r[i] * (r[i] - 1) // 2
print (result)