import sys
cin = sys.stdin.readline

n = int(cin())
sum = n
tmp = n -1
divisor = n // 2
for i in range(2, divisor):
    sum += tmp // i
sum += divisor
sum += 2 * divisor
if n % 2 == 1: sum += tmp // divisor
sum -= 1
print(sum)