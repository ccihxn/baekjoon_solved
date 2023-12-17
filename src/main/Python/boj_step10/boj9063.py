import sys
cin = sys.stdin.readline

N = int(cin())
xList = []
yList = []
for _ in range(N):
    x, y = map(int, cin().split())
    xList.append(x)
    yList.append(y)
print((max(xList) - min(xList)) * (max(yList) - min(yList)))