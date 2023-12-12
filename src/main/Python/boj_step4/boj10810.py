import sys
cin = sys.stdin.readline

N, M = map(int, cin().split())
basket = [0] * N
for _ in range(M):
    i, j, k = map(int, cin().split())
    for index in range(i - 1, j):
        basket[index] = k
for ball in basket: print(ball, end=' ')