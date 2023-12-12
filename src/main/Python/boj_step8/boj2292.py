import sys
cin = sys.stdin.readline

N = int(cin())
node = 1
tmp = 6
result = 1
while N > node:
    node += tmp
    tmp += 6
    result += 1
print(result)