import sys
cin = sys.stdin.readline

N, K = map(int, cin().split())
factors = []
for i in range(1, N + 1):
    if N % i == 0:
        factors.append(i)
        if len(factors) == K:
            print(factors.pop())
            exit()
print(0)