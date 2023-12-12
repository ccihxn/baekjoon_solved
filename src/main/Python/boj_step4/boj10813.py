import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
basket = list(range(1, N + 1))
for _ in range(M):
    i, j = map(int, cin().split())
    basket[i - 1], basket[j - 1] = basket[j - 1], basket[i - 1]
for ball in basket: print(ball, end=' ')