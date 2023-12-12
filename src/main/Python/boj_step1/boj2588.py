import sys

a = int(sys.stdin.readline())
tmp = b = int(sys.stdin.readline())
print(a * (tmp % 10), end='\n')
tmp //= 10
print(a * (tmp % 10), end='\n')
tmp //= 10
print(a * (tmp % 10), end='\n')
print(a * b, end='\n')