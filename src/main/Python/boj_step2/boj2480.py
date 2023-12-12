import sys

a, b, c = map(int, sys.stdin.readline().split())
reward = int()
if a == b and a == c: reward = 10_000 + 1_000 * a
elif a == b or a == c: reward = 1_000 + 100 * a
elif b == c: reward = 1_000 + 100 * b
else: reward = max(a, max(b, c)) * 100
print(reward)