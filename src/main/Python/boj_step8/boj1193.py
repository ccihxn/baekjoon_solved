import sys
cin = sys.stdin.readline

N = int(cin())
sum = 0
for i in range(10_000_000):
    if N >= sum + 1 and N <= sum + i:
        if i % 2 == 0:
            print(f'{i - (sum + i - N)}/{1 + (sum + i - N)}')
            break
        else:
            print(f'{1 + (sum + i - N)}/{i - (sum + i - N)}')
            break
    else: sum += i