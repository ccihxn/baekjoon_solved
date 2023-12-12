import sys
cin = sys.stdin.readline

while True:
    n = int(cin())
    factors = []
    if n == -1: exit()
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            factors.append(i)
    if n == sum(factors):
        print(n, '=', ' + '.join(map(str, factors)))
    else:
        print(f'{n} is NOT perfect.')