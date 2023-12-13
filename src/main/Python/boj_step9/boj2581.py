import sys
cin = sys.stdin.readline

isPrime = [True] * 10_001
isPrime[1] = False
for i in range(2, 5_001):
    for j in range(i * 2, 10_001, i):
        isPrime[j] = False
sum = 0
M = int(cin())
N = int(cin())
minPrime = 0
for i in range(M, N + 1):
    if isPrime[i]:
        if sum == 0: minPrime = i
        sum += i
if sum == 0:
    print(-1)
    exit()
print(sum)
print(minPrime)
