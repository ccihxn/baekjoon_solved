import sys
cin = sys.stdin.readline

K = int(cin())
cog = []
for _ in range(K):
    money = int(cin())
    if money == 0: cog.pop()
    else: cog.append(money)
print(sum(cog))