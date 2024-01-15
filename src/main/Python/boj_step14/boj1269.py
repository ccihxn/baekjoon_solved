import sys
cin = sys.stdin.readline

n, m = map(int, cin().split())
A = set(map(int, cin().split()))
B = set(map(int, cin().split()))
print(len((A - B) | (B - A)))