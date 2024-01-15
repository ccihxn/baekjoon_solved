import sys
cin = sys.stdin.readline

def gcd(a, b): return a if b == 0 else gcd(b, a % b)

def lcm(a, b): return (a * b) // gcd(a, b)

a, b = map(int, cin().split())
x, y = map(int, cin().split())
numerator = (a * (lcm(b, y) // b)) + (x * (lcm(b, y) // y))
denominator = lcm(b, y)
common_factor = gcd(numerator, denominator)
result_numerator = numerator // common_factor
result_denominator = denominator // common_factor
print(f"{result_numerator} {result_denominator}")