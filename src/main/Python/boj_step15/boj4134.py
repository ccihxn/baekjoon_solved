import sys
import math
cin = sys.stdin.readline

T = int(cin())
for _ in range(T):
    n = int(cin())
    while True:
        isPrime = True
        if n <= 1:
            print(2)
            break
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                isPrime = False
                break
        if isPrime:
            print(n)
            break
        else: n += 1