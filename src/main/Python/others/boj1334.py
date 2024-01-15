import sys
cin = sys.stdin.readline

N = cin().strip()
if N == N[::-1]:
    print(N)
    exit()
if len(N) % 2 == 1:
    if int(N[:len(N) // 2][::-1]) < int(N[len(N) // 2 + 1:]):
        result = N[:len(N) // 2] + str(int(N[len(N) // 2: len(N) // 2 + 1]) + 1) + N[:len(N) // 2][::-1]
    else:
        result = N[:len(N) // 2] + N[len(N) // 2: len(N) // 2 + 1] + N[:len(N) // 2][::-1]
else:
    if int(N[:len(N) // 2][::-1]) < int(N[len(N) // 2:]):
        tmp = str(int(N[:len(N) // 2]) + 1)
        result = tmp + tmp[::-1]
    else:
        tmp = N[:len(N) // 2]
        result = tmp + tmp[::-1]
print(result)
