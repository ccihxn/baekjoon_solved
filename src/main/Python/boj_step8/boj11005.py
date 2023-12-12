import sys
cin = sys.stdin.readline

N, B = map(int, cin().split())
tmp = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
result = ''
while N > 0:
    result += tmp[N % B]
    N //= B
print(result[::-1])