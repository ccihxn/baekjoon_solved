import sys
cin = sys.stdin.readline

A = []
for _ in range(int(cin())):
    x = list(map(int, cin().split()))
    if x[0] == 1:
        A.append(x[1])
    elif x[0] == 2:
        if len(A) == 0: print(-1)
        else: print(A.pop())
    elif x[0] == 3:
        print(len(A))
    elif x[0] == 4:
        print(int(len(A) == 0))
    elif x[0] == 5:
        if len(A) == 0: print(-1)
        else: print(A[-1])