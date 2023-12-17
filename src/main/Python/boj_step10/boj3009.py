import sys
cin = sys.stdin.readline

xList = [0] * 3
yList = [0] * 3
for i in range(3):
    x, y = map(int, cin().split())
    xList[i] = x
    yList[i] = y
x = list(filter(lambda x: xList.count(x) == 1, xList))
y = list(filter(lambda y: yList.count(y) == 1, yList))
print(x.pop(), y.pop())