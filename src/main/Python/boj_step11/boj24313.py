import sys
cin = sys.stdin.readline

a1, a0 = map(int, cin().split())
c = int(cin())
a = int(cin())
print(1 if a1 * a + a0 <= c * a and c >= a1 else 0)