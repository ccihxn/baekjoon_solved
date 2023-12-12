import sys
cin = sys.stdin.readline

for _ in range(int(cin())):
    line = cin().strip()
    print(line[0] + line[len(line) - 1])