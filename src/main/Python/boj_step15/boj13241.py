import sys
cin = sys.stdin.readline

def gcd(a, b): return gcd(b, a % b) if b!= 0 else a

a, b = map(int, cin().split())
print((a * b) // gcd(a, b))