import sys
cin = sys.stdin.readline

N = int(cin())
A = list(map(int, cin().split()))
isPrime = [True] * 1_001
isPrime[1] = False
for i in range(2, 501):
    for j in range(i * 2, 1_001, i):
        isPrime[j] = False
cnt = 0
for n in A:
    if isPrime[n]: cnt += 1
print(cnt)