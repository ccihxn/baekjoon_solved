import sys
cin = sys.stdin.readline

N = int(cin())
divisor = 2
while N != 1:
    if N % divisor == 0:
        N //= divisor
        print(divisor)
        continue
    divisor += 1