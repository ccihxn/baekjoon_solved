import sys
cin = sys.stdin.readline

N = int(cin())
result = ''
for _ in range (N // 4): result += 'long '
result += 'int'
print(result)